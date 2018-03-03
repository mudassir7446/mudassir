/**
 * This program demonstrates the storage types available in c
 *
 * auto
 * register
 * static 
 * extern
 *
 * */
#include<stdio.h>

void fn();
static int count = 5; // global variable

int main(){

int mount ;
auto int month;
register int miles;

while(count--){
	fn();
		}
}

void fn(){
	static int i =5; // statuc local variable
	i++;
	printf("i is %d and count is %d\n",i,count);
}

