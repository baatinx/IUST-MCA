#include"stdio.h"
#include"conio.h"
#include"math.h"
#include"dos.h"
#include"stdlib.h"
#include"graphics.h"

void main(){
	int x,y,x1,y1,x2,y2,dx,dy,p,i;
	int gd=DETECT,gm;
	printf("enter the co-ordinates of first point\n");
	scanf("%d%d",&x1,&y1);
	clrscr();

	printf("enter the co-ordinates of first point\n");
	scanf("%d%d",&x2,&y2);
	clrscr();

	x=x1;
	y=y1;

	dx=  x2-x1;
	dy=  y2-y1;

	p=2*dy-dx;

	initgraph(&gd,&gm,"C:\\TC\\bgi");

	while(x<x2){
		delay(5);
		if(p>=0){
		putpixel(x,y,7);
		y=y+1;
		p=p+ 2*dy - 2*dx  ;

		}
		else{
		putpixel(x,y,7);
		p=p+2*dy;
		}
		x=x+1;

	}
	getch();

	closegraph();

}