#include"stdio.h"
#include"conio.h"
#include"graphics.h"
void main(){

	int rem,i,j;
	int arr[8] = {0,0,0,0,0,0,0,0};
	long int 	seed,seed_sqr,temp;
	double rand;
	int range = 10;
	clrscr();

	printf("enter the seed\t");
	scanf("%ld",&seed);
	clrscr();


	seed_sqr = seed*seed;

	i = 8;

	temp = seed_sqr;
	while(temp != 0){
		rem = temp%10;
		arr[--i] = rem;
		temp = temp/10;
	}

	printf("array representation of number is : \n");

	for(i = 0; i < 8; i++)
		printf("arr[%d] = %d\n",i,arr[i]);

	printf("Seed		Seed^2	       	  Rand\n");

	do{
	printf("%ld		",seed);
	printf("	");
	printf("%ld		",seed_sqr);

	seed = 0;
	for(i = 2; i <= 5; i++)
		seed = (seed*10)+arr[i];

	rand = (double)seed/10000;
	printf("%0.4lf		",rand);
	printf("\n");

	seed_sqr = seed*seed;

	temp = seed_sqr;
	i=8;
	while(temp != 0){
		rem = temp%10;
		arr[--i] = rem;
		temp = temp/10;
	}

	range--;

	}while(range != 0);

	getch();

}