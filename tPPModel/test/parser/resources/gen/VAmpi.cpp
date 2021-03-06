/*MPI Template */
#include <stdio.h>
#include <mpi.h>

void extern timerstart(char* name);
void extern timerend();


// Host code
int* abstract_vectorAdd(int* A,int* B,int* C,int TOTAL_SIZE)
{

	timerstart("MPI");
  int rank, size;

  MPI_Init (&argc, &argv);	/* starts MPI */
  MPI_Comm_rank (MPI_COMM_WORLD, &rank);	/* get current process id */
  MPI_Comm_size (MPI_COMM_WORLD, &size);	/* get number of processes */

/*********************
 Implementation goes here

**********************/

  MPI_Finalize();

	timerstart("MPI"); 
        return C;

}