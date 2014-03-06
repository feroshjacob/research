#include <stdio.h>
#include <omp.h>


void extern timerstart(char* name);
void extern timerend();

// Host code
int* abstract_vectorAdd(int* A,int* B,int* C,int TOTAL_SIZE)
{


	timerstart("OMP");
	/************
	 SAMPLE OMP CODE GOES BELOW


	int i, chunk = 100;
#pragma omp parallel shared(A,B,C,chunk) private(i)
	{
#pragma omp for schedule(dynamic,chunk) nowait
		for (i = 0; i < TOTAL_SIZE; i++)
			C[i] = A[i] + B[i];

	}
	 *************/
	timerend();

        return C;

}