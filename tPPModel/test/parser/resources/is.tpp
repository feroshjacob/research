	declare  random [is.c] {
	in key_array, MAX_KEY, TOTAL_KEYS
	out key_array
	}
	map random<-CUDA cuda_rand1 [rand.cu]
	            
	             
	execute omp_random.


