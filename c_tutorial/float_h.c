/**
 * This prgram demonstrates basic examples for float.h preprocessor
 */
#include <stdio.h>
#include <float.h>
int main(){
	printf("Demostrating the float.h preprocessor\n");
	// Printing the size of float
	printf("Storage size for float : %ld \n",sizeof(float));
	// Pringing the miniomum positive float value 
	printf("Minimum float positive value : %E \n",FLT_MIN);
	printf("Maximum float positive value : %E \n",FLT_MAX);
	printf("Precision value : %d \n",FLT_DIG);
}


