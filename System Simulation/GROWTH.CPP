#include"stdio.h"
#include"conio.h"
#include"math.h"
void main(){
	int princple, year, netAmount;
	float rate;
	clrscr();
	princple = 1000;
	rate = 15;
	year = 10;

	printf("Princple Amount : %d \nIntrest :  %f  \nYear : %d \n",princple, rate, year);

	rate = rate / (float)(100);
	netAmount = princple *( pow( (1 + rate), year) );

	printf("principle amount after ten years : %d",netAmount);
	getch();
}
