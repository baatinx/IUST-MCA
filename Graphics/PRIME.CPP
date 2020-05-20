#include<stdio.h>
#include<conio.h>

int prime(int x);

		 /******************************************************/
		 /** please do not edit the code, thank you, in advance */
void main(){
	int i,num=2,upper_bound,d=2;
	printf("enter the upper bound till u want to generate prime numbers\t");
	scanf("%d",&upper_bound);
	clrscr();
	for(i=2;i<=upper_bound;i++){
		prime(i);
	}
	getch();


}