/**
 * This program demonstrates the const keyword basic use
 */
#include<stdio.h>
int main(){
	 const int LENGTH = 10;
	 const int WIDTH = 5;
	 const char NEW_LINE = '\n';

	  int area;
	  area = LENGTH * WIDTH ;
	   printf("Value of area : %d",area);
	   printf("%c",NEW_LINE);
	   
}
