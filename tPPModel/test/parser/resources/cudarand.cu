#include <cutil_inline.h>
#define BLOCK_SIZE 16
#include <stdio.h>

#if defined(USE_POW)
#define r23 pow(0.5, 23.0)
#define r46 (r23*r23)
#define t23 pow(2.0, 23.0)
#define t46 (t23*t23)
#else
#define r23 (0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5*0.5)
#define r46 (r23*r23)
#define t23 (2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0*2.0)
#define t46 (t23*t23)
#endif
#define	A_VAR	1220703125.0

int *cudarand(int h_A[], int N);
 __device__ double	randlcK(double *X, double *A);
__device__ double   find_my_seedK( long kn,       /* my processor rank, 0<=kn<=num procs */
                       long np,       /* np = num procs                      */
                       long nn);       /* total num of ran numbers, all procs */

 __device__ double	randlcK(double *X, double *A)
{
       int      KS=0;
       double	R23, R46, T23, T46;
      double		T1, T2, T3, T4;
      double		A1;
      double		A2;
      double		X1;
      double		X2;
      double		Z;
      int     		i, j;

      if (KS == 0) 
      {
        R23 = 1.0;
        R46 = 1.0;
        T23 = 1.0;
        T46 = 1.0;
    
        for (i=1; i<=23; i++)
        {
          R23 = 0.50 * R23;
          T23 = 2.0 * T23;
        }
        for (i=1; i<=46; i++)
        {
          R46 = 0.50 * R46;
          T46 = 2.0 * T46;
        }
        KS = 1;
      }

/*  Break A into two parts such that A = 2^23 * A1 + A2 and set X = N.  */

      T1 = R23 * *A;
      j  = T1;
      A1 = j;
      A2 = *A - T23 * A1;

/*  Break X into two parts such that X = 2^23 * X1 + X2, compute
    Z = A1 * X2 + A2 * X1  (mod 2^23), and then
    X = 2^23 * Z + A2 * X2  (mod 2^46).                            */

      T1 = R23 * *X;
      j  = T1;
      X1 = j;
      X2 = *X - T23 * X1;
      T1 = A1 * X2 + A2 * X1;
      
      j  = R23 * T1;
      T2 = j;
      Z = T1 - T23 * T2;
      T3 = T23 * Z + A2 * X2;
      j  = R46 * T3;
      T4 = j;
      *X = T3 - T46 * T4;
      return(R46 * *X);
}
__device__ double   find_my_seedK( long kn,       /* my processor rank, 0<=kn<=num procs */
                       long np,       /* np = num procs                      */
                       long nn)       /* total num of ran numbers, all procs */
                      // double s,      /* Ran num seed, for ex.: 314159265.00 */
                      // double a )     /* Ran num gen mult, try 1220703125.00 */
{
    double s=314159265.00;
    double a=122073125.00;
      double t1,t2;
      long   mq,nq,kk,ik;
      if ( kn == 0 ) return s;
      mq = (nn/4 + np - 1) / np;
      nq = mq * 4 * kn;               /* number of rans to be skipped */
      t1 = s;
      t2 = a;
      kk = nq;
      while ( kk > 1 ) {
      	 ik = kk / 2;
         if( 2 * ik ==  kk ) {
            (void)randlcK( &t2, &t2 );
	    kk = ik;
	 }
	 else {
            (void)randlcK( &t1, &t2 );
	    kk = kk - 1;
	 }
      }
      (void)randlcK( &t1, &t2 );
      return( t1 );
}



__global__ void cudarandK( int* y,long n,long max_key) {

    const int      tid = blockDim.x * blockIdx.x + threadIdx.x;
    //Total number of threads in execution grid
    const int THREAD_N = blockDim.x * gridDim.x;

    //No matter how small is execution grid or how large OptN is,
    //exactly OptN indices will be processed with perfect memory coalescing
    for(int opt = tid; opt < n; opt += THREAD_N){
	double x;
    double a=1220703125.00;                   /* Random number gen mult */
    double seed;
        seed= find_my_seedK(opt,THREAD_N,n);
        //printf("seed=%f\n",seed);
	    x = randlcK(&seed, &a);
	    x += randlcK(&seed, &a);
    	    x += randlcK(&seed, &a);
	    x += randlcK(&seed, &a);  
            y[opt] = max_key*x/4;
        }
}

int *cudarand(int h_A[], long N, long max_key) {

    int* d_A;
size_t size = N*sizeof(int);
   cutilSafeCall(
         cudaMalloc((void**)&d_A, size) );
    // Copy vectors from host memory to device memory


    cudarandK<<<480, 256>>>(d_A, N,max_key);
     cutilCheckMsg("kernel launch failure");
   cutilSafeCall(
     cudaThreadSynchronize() );

    // Copy result from device memory to host memory
    // h1_C contains the result in host memory
   cutilSafeCall(
     cudaMemcpy(h_A, d_A, size, cudaMemcpyDeviceToHost) );

        cutilSafeCall(cudaFree(d_A));
        cutilSafeCall(cudaThreadExit());
    return h_A;
}



