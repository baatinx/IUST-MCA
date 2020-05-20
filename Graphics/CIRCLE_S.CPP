//circle at specific position
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<dos.h>

		 /******************************************************/
		 /** please do not edit the code, thank you, in advance */
void main(){
	int gd=DETECT,gm,r,a,b,x1,y1;
	float i;
	clrscr();
	printf("enter the point's co-ordinates\n");
	printf("(x1,y1) =>\t");
	scanf("%d%d",&x1,&y1);
	clrscr();
	printf("enter the radius of the circle\t");
	scanf("%d",&r);
	clrscr();
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	for(i=0;i<360;i=(i+0.1)){
		a=r*cos(i);
		b=r*sin(i);
		putpixel((x1+a),(y1+b),WHITE);
		delay(1);
	}

	getch();
	closegraph();
}