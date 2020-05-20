#include"stdio.h"
#include"conio.h"

void main(){
	int a, seed, c, m, i, x;
	clrscr();
	a = 20;
	seed = 1;
	c = 0;
	m = 9;

	seed = ( ( a * seed ) + c ) % ( m );
	printf("LCG");
	printf("%d\n", seed);

	for( i = 0; i < m + 10; i++){
		seed = ( ( a * seed ) + c ) % ( m );
		printf("%d\n", seed);
	}
	getch();
}