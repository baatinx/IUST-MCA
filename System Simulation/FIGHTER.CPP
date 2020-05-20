#include"stdio.h"
#include"conio.h"'
#include"stdlib.h"
#include"math.h"
void  main(){
	int xf, yf, xb, yb, b, p, distance, i, t = 4, range = 12, velocity = 12;
	int bomber[2][4];

	clrscr();

	bomber[0][0] = 20;
	bomber[0][1] = 50;
	bomber[0][2] = 70;
	bomber[0][3] = 80;

	bomber[1][0] = 30;
	bomber[1][1] = 60;
	bomber[1][2] = 80;
	bomber[1][3] = 70;

	xf = 10;
	yf = 0;

	i = 0;

	printf("Figher\t\t\tBomber\t\t\tDistance\n");
	do{
	xb = bomber[0][i];
	yb = bomber[1][i++];


	b = xb - xf;
	p = yb - yf;



	distance =(int) sqrt( (b*b) + (p*p) );

	printf("(Xf,Yf)(%d,%d)\t\t(Xb,Yb)(%d,%d)\t\t%d\n",xf,yf,xb,yb,distance);

	if( distance < range ){
		printf("bobmer destroyed");
		getch();
		exit(0);
	}else{
		xf = xf + (velocity *  ( (float) (b) / (float)(distance)  ) );

		yf = yf + (velocity *  ( (float) (p) / (float)(distance)  ) );

	}
	}while(i<t);
	printf("bobmer escaped");
	getch();



}