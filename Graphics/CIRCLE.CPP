#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
#include<dos.h>

	// circle drawing program with respect to xc and yc using r*cos(0) and r.sin(0)

		 /******************************************************/
		 /** please do not edit the code, thank you, in advance */
void main(){
	int gd=DETECT,gm,x,y,r,i;
	clrscr();
	printf("enter the point's co-ordinates\n");
	printf("(X,Y) =>\t");
	scanf("%d%d",&x,&y);
	clrscr();
	printf("enter the radius of the circle\t");
	scanf("%d",&r);
	clrscr();
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	for(i=0;i<360;i++){
		putpixel((r*cos(i)) + x , (r*sin(i)) + y ,WHITE);
		delay(2);
	}
	getch();
	closegraph();
}