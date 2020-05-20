//difference between two points
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<dos.h>

		 /******************************************************/
		 /** please do not edit the code, thank you, in advance */
void main(){
	int gd=DETECT,gm,x1,y1,x2,y2,distance;
	clrscr();
	printf("enter the first point's co-ordinates\n");
	printf("(x1,y1) =>\t");
	scanf("%d%d",&x1,&y1);
	clrscr();
	printf("enter the second point's co-ordinates\n");
	printf("(x2,y2) =>\t");
	scanf("%d%d",&x2,&y2);
	clrscr();
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	line(x1,y1,x2,y2);
	distance=sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	printf("the distance between two points is %d",distance);
	getch();
	closegraph();
}