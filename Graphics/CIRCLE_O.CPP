#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<dos.h>
	//circle drawing program at orgin using r*cos(0) and r*sin(0)

		 /******************************************************/
		 /** please do not edit the code, thank you, in advance */
void main(){
	int gd=DETECT,gm,r,i;
	clrscr();
	printf("enter the radius of the circle\t");
	scanf("%d",&r);
	clrscr();
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	for(i=0;i<360;i++){
		putpixel(r*cos(i) , r*sin(i),WHITE);
		delay(2);
	}
	getch();
	closegraph();
}