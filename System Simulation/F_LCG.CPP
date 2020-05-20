#include"stdio.h"
#include"conio.h"

int lcg(int, int, int, int);
void main(){

	int a,xi,xi1,c,m,counter;

	a = 2;
	xi = 1;
	c = 8;
	m = 19;

	clrscr();

	printf("Enter the no. of random numbers you want to generate \t");
	scanf("%d",&counter);
	clrscr();

	printf("A \t Xi \t C \t M \t\t\t X(i+1) \n");
		xi1 = lcg(a,xi,c,m);
	for(int i = 0; i<counter; i++){

		printf("%d \t %d \t %d \t %d \t\t\t %d \n",a,xi,c,m,xi1);
		xi = xi1;
		xi1 = xi + lcg(a,xi,c,m);

	}

	getch();

}

int lcg(int a, int xi, int c, int m){
	return ( (a * xi + c) % m ) ;

}