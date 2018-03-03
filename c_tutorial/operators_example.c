/**
 *  This program demonstrates different available operators in c language.
 */

#include<stdio.h>

void _add();
void _substract();
void _division();
void _multiply();
void _reminder();
void _increment();
void _decrement();

int main(){
	printf("Arithmatic operators \n" );
	// add operator
	_add();
	// substract operator
	_substract();
	// division operator 
	_division();
	// multiply operator
	_multiply();
	// modulus operator
	_reminder();
	// increment operatopr
	_increment();
	// decrement operator
	_decrement();
}

void _add(){
	int a = 5;
	int b = 10; 
	int c = a + b; 
	printf("a + b : %d\n",c);
}

void _substract(){
	int a = 10;
	int b = 5;
	int c = a - b;
	printf("a - b : %d\n",c);

}

void _division(){
	int a = 10;
	int b = 5;
	int c = a / b;
	printf("a/b : %d\n",c);
}

void _multiply(){
	int a = 10;
	int b = 5;
	int c = a * b;
	printf("a*b : %d\n",c);
}

void _reminder(){
	int a = 10;
	int b = 5;
	int c = a % b;
	printf("a %% b : %d\n",c);
}

void _increment(){
	int a = 10;
	printf("a : %d,",a);
	printf("a++ : %d\n",++a);
}

void _decrement(){
	int a = 10 ;
	printf("a : %d,",a);
	printf("a-- : %d\n",--a);
}
