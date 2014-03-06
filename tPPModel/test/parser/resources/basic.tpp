declare  random [is.c] {
in key_array, max_value
out key_array
}
map random<-OMP omp_random [ompis.c], CUDA cuda_rand1 [rand.cu],
             CUDA cuda_rand2[rand2.cu]
             
execute ISExecutable omp_random, somethingelse.