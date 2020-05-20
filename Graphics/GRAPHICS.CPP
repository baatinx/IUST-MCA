#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
		    /******************************************************/
		    /** please do not edit the code, thank you, in advance */

void main(){
	int gd=DETECT,gm,midx,midy,radius;
	midx=getmaxx()/2;
	midy=getmaxy()/2;
	printf("enter the radius for circle\t");
	scanf("%d",&radius);
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	putpixel(29,100,RED);
	circle(midx,midy,radius);
	getch();
	closegraph();
}