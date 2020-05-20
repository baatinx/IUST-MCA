#include"stdio.h"
#include"conio.h"

void main(){
	clrscr();
	printf("\033[1;31m");
	printf("Hello world\n");
	printf("\033[0m");

	getch();
}