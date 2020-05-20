#include"stdio.h"
#include"conio.h"

void main(){
	float a, b, c, d, pi, price;
	int supply, demand;
	clrscr();
	a = 12.4;
	b = 1.2;
	c = 1.0;
	d = 0.9;

	pi = 1.0;

	for(int i = 0; i < 20; i++)
	{
		supply = c + ( d * pi);
		demand = supply;
		price = (a - (float)supply) / b;
		pi = price;
		printf("supply : %d \t Price : %f\n", supply, price);
	}
	getch();
}