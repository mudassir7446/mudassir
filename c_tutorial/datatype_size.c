/**
 *  This program prints the size of all the basic data types for a specific machine
 *  
 */

#include <stdio.h>
#include <limits.h>
int main (){

	printf("Storage size of for int : %ld \n",sizeof(int));
	printf("Storage size of for char : %ld \n",sizeof(char));
	printf("Storage size of for long : %ld \n",sizeof(long));
	printf("Storage size of for short : %ld \n",sizeof(short));
	printf("Storage size of for float : %ld \n",sizeof(float));
	printf("Storage size of for double  : %ld \n",sizeof(double));


}
