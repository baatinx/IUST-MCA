#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<math.h>
#include<dos.h>

		    /******************************************************/
		    /** please do not edit the code, thank you, in advance */

//void dda(int x1,int y1,int x2,int y2);

void main(){
	int x1,y1,x2,y2,dx,dy,step,i,gd=DETECT,gm;
	float xinc,yinc;
	float x,y;
	clrscr();
	printf("enter the co-ordinates of point P1\n(x1,y1)\t");
	scanf("%d%d",&x1,&y1);
	clrscr();

	printf("enter the co-ordinates of point P2\n(x2,y2)\t");
	scanf("%d%d",&x2,&y2);
	clrscr();

	dx=x2-x1;
	dy=y2-y1;

	if(dx>dy)
		step=dx;
	else
		step=dy;

	xinc=dx/(float)step;
	yinc=dy/(float)step;

	x=x1;
	y=y1;

	initgraph(&gd,&gm,"C:\\TC\\BGI");

	for(i=0;i<step;i++){
		delay(5);
		putpixel(x,y,WHITE);
		x=x+xinc;
		y=y+yinc;
	}

	getch();
	closegraph();
}