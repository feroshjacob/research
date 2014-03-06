#include <stdio.h>
#ifdef TPPMODEL_DEFINED 
#include "pp_abstract.h"
#endif  
#define TOTAL_SIZE 1000
	int A[1000], B[1000],C[1000];

void vectoradd()
{
	int i;
	for(i=0;i<TOTAL_SIZE;i++)
	{
	C[i]= A[i]+B[i];		
	}
}
void verify()
{
	int i;
	for(i=0;i<TOTAL_SIZE;i++)
	{
	if(C[i]!=2)
	{	
		printf("Test failed\n");
		return;
	}
	}

	printf("Test passed\n");
}
int main() 
{
	int i;


	for( i=0; i<TOTAL_SIZE;i++)
	{
		A[i]=1;
		B[i]=1;
	}
	
#pragma TPPMODEL vectorAdd
{
#ifdef vectorAdd_DEFINED
	abstract_vectorAdd(A,B,C,TOTAL_SIZE);
#else
	 {
	 		vectoradd();
	 	}
#endif
}



	verify();
	return 0;
}
