#include <stdio.h>
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
	#pragma tppmodel vectorAdd
	{
		vectoradd();
	}


	verify();
	return 0;
}
