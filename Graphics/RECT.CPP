#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<dos.h>

		    /******************************************************/
		    /** please do not edit the code, thank you, in advance */

void main(){
	int gd=DETECT,gm,x1,y1,x2,y2,i;

	printf("enter the two diagonal point's co-ordinate for the rectangle\n");
	printf("(x1,y1) =>\t");
	scanf("%d%d",&x1,&y1);
	clrscr();
	printf("(x2,y2) =>\t");
	scanf("%d%d",&x2,&y2);
	initgraph(&gd,&gm,"C:\\TC\\BGI");
     //	line(x1,y1,x2,y2);
	i=x1;
	while(i<=x2){
		delay(5);
		putpixel(i,y1,RED);
		putpixel(i,y2,RED);
		i++;
	}
	i=y1;
	while(i<=y2){
		delay(5);
		putpixel(x1,i,RED);
		putpixel(x2,i,RED);
		i++;
	}
	getch();
	closegraph();
}