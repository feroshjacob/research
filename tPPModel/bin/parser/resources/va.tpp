	declare  vectorAdd [vectoradd.cpp] {
	in A,B,C, TOTAL_SIZE
	out C
	}
	map vectorAdd<-CUDA cuda_VA [VAcuda.cu], OMP omp_VA [VAomp.cpp], MPI omp_VA [VAmpi.cpp]
	             
	execute VACUDA_EXE cuda_VA.


