#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<math.h>
#include<dos.h>

		// BRESENHAM-circle drawing algorithm,at origin

		    /******************************************************/
		    /** please do not edit the code, thank you, in advance */

void main(){
	int r,p,x,y,i,gd=DETECT,gm;
	clrscr();
	printf("Mid-point circle algorithm(first Quadrant)\nenter the radius of the circle\t");
	scanf("%d",&r);
	clrscr();
	x=0;
	y=r;
	p=3-2*r; 		//initial decsion parameter
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	putpixel(x,y,WHITE);

	while(x<=y){
		if(p<0){
			p=p + 4*x + 6;
			x=x+1;
			y=y;
		}else{
			p=p + 4*(x-y) + 10;
			x=x+1;
			y=y-1;
		}
		delay(3);
		putpixel(x,y,WHITE);
	}
	getch();
	closegraph();
}