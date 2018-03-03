/**
 * This program demonstrates the #define preporocessor use to define constants
 */
#include<stdio.h>

#define LENGTH 10
#define WIDTH 5
#define NEWLINE '\n'

int main(){
	int area;
	area = LENGTH * WIDTH;
	printf("Value of area : %d",area);
	printf("%c",NEWLINE);
}
