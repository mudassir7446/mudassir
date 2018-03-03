/**
 * This program demonstrates the use of rextern keyword
 *
 * extern_function : Defined in extern_example_2 and declared , used in this file
 */
#include<stdio.h>
extern int extern_function(void);
int main(){
	printf("Extern return value : %d\n",extern_function());
}
