/**
 * Program demonstrates the basic function declaration and defiinition
 */

#include<stdio.h>
// declaring the function
 int fn();

 int main(){
 	int i = fn();
	printf("Value of i : %d\n",i);
 }

/**
 * Defining the function fn
 */
int fn(){
	return 10;
}
