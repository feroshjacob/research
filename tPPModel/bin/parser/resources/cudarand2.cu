#include <cutil_inline.h>
#include "cudarand2.hpp"

*cudarand( int *final,long size,long  max_value  )
{
    int seed =123;
  // setup execution grid to get max performance
  threadsX = 192;
  blocksX  = 32;

  const int nThreads = threadsX*blocksX;

  uint2* seeds = new uint2[ nThreads ];

  cutilSafeCall( cudaMalloc( (void**) &state, sizeof(uint2)*nThreads ) );

  // calculate strided iteration constants
  unsigned long long A, C;
  A = 1LL; C = 0LL;
  for (unsigned int i = 0; i < nThreads; ++i) {
    C += A*c;
    A *= a;
  }
  A0 = A & 0xFFFFFFLL;
  A1 = (A >> 24) & 0xFFFFFFLL;
  C0 = C & 0xFFFFFFLL;
  C1 = (C >> 24) & 0xFFFFFFLL;

  // prepare first nThreads random numbers from seed
  unsigned long long x = (((unsigned long long)seed) << 16) | 0x330E;
  for (unsigned int i = 0; i < nThreads; ++i) {
    x = a*x + c;
    seeds[i].x = x & 0xFFFFFFLL;
    seeds[i].y = (x >> 24) & 0xFFFFFFLL;
  }

  cutilSafeCall(cudaMemcpy(state, seeds, sizeof(uint2)*nThreads, cudaMemcpyHostToDevice));

  delete[] seeds;
  generate(size, max_value);
  get(final,size);
  cleanup();
  return final;
}

void
//RNG_rand48::cleanup() {
  cleanup(){
  cutilSafeCall(cudaFree((void*) state));
  cutilSafeCall(cudaFree((void*) res));
}

void
//RNG_rand48::generate(int n)
generate(long n, long max_value)
{
  const int nThreads = threadsX*blocksX;

  int num_blocks = (n + nThreads-1)/nThreads;
	
  if (res == 0) {
    cutilSafeCall(cudaMalloc( (void**) &res, sizeof(int)*nThreads*num_blocks));
  }
  
  dim3 grid( blocksX, 1, 1);
  dim3 threads( threadsX, 1, 1);

  uint2 A, C;
  A.x = A0; A.y = A1;
  C.x = C0; C.y = C1;

  // call GPU kernel
  RNG_rand48_get_int<<< grid, threads >>>((uint2 *)state, (int *)res, num_blocks, A, C, max_value);
}

void
//RNG_rand48::get(int *r, int n)
get(int *r, int n)
 {
  cutilSafeCall(cudaMemcpy( r, res, sizeof(int)*n, cudaMemcpyDeviceToHost ) );
}
