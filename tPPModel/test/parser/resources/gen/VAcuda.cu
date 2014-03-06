#include <stdio.h>
#include <cutil_inline.h>


void extern timerstart(char* name);
void extern timerend();

// Device code
__device__ void vectorAdd_main(int* A,int* B,int* C, int opt)
{
/* Sample Vector add code 
 C[opt]=A[opt]+ B[opt];
*/


}

//This kernel distributes the work irrespective of the size
__global__ void vectorAdd_kernel(int* A,int* B,int* C,int TOTAL_SIZE)
{
    const int      tid = blockDim.x * blockIdx.x + threadIdx.x;
    const int THREAD_N = blockDim.x * gridDim.x;

    for(int opt = tid; opt < TOTAL_SIZE; opt += THREAD_N){
          vectorAdd_main(A,B,C,opt);    
	}
}

// Host code
int* abstract_vectorAdd(int* A,int* B,int* C,int TOTAL_SIZE)
{
	    timerstart("CUDA");
int* d_A ; 
int* d_B ; 
int* d_C ; 

    // Allocate vectors in device memory
    cutilSafeCall( cudaMalloc((void**)&d_A, sizeof(int)*1000)) ; 
    cutilSafeCall( cudaMalloc((void**)&d_B, sizeof(int)*1000)) ; 
    cutilSafeCall( cudaMalloc((void**)&d_C, sizeof(int)*1000)) ; 

    // Copy variables from host memory to device memory

    cutilSafeCall( cudaMemcpy(d_A,A, sizeof(int)*1000,cudaMemcpyHostToDevice) ); 
    cutilSafeCall( cudaMemcpy(d_B,B, sizeof(int)*1000,cudaMemcpyHostToDevice) ); 
    cutilSafeCall( cudaMemcpy(d_C,C, sizeof(int)*1000,cudaMemcpyHostToDevice) ); 

    // Kernel call with 480*256 threads



    vectorAdd_kernel<<<480, 256>>>(d_A,d_B,d_C,TOTAL_SIZE);


    cutilCheckMsg("kernel launch failure\n");
    cutilSafeCall( cudaThreadSynchronize() );

    // Copy variables from device memory to host memory

    cutilSafeCall( cudaMemcpy(C,d_C, sizeof(int)*1000,cudaMemcpyDeviceToHost) ); 

      if (d_A) cutilSafeCall( cudaFree(d_A)) ; 
      if (d_B) cutilSafeCall( cudaFree(d_B)) ; 
      if (d_C) cutilSafeCall( cudaFree(d_C)) ; 
      timerend();

    return C;

}