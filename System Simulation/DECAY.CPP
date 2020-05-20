#include"stdio.h"
#include"conio.h"
#include"math.h"
void main(){
	int price	, year, netPrice;
	float rate;
	clrscr();
	price = 1000;
	rate = 10;
	year = 3;

	printf("Initial Price : %d \nDepriciation :  %f  \nYear : %d \n",price, rate, year);

	rate = rate / (float)(100);
	netPrice = price *( pow( (1 - rate), year) );

	printf("principle amount after ten years : %d",netPrice);
	getch();
}
