#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<math.h>
#include<dos.h>

	// MID-POINT circle drawing algorithm with respect to Xc and Yc
		/******************************************************/
		/** please do not edit the code, thank you, in advance */

void pixel (int x,int y,int xc,int yc);
void main(){
	int xc,yc,x,y,r,p,gd=DETECT,gm;
	clrscr();
	printf("enter the radius of the circle\t");
	scanf("%d",&r);
	printf("enter the origin co-ordinates of the circle(X,Y)");
	scanf("%d%d",&xc,&yc);
	clrscr();
	x=0;
	y=r;
	p=1-r;
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	pixel(x,y,xc,yc);
	while(x<=y){
		if(p<0){
			p= p + 2*x + 3;
			x=x+1;
			y=y;
		}else{
			p= p+2*(x-y) + 5;
			x=x+1;
			y=y-1;
		}
		delay(10);
		pixel(x,y,xc,yc);
	}
	getch();
	closegraph();
}

void pixel(int x,int y, int xc,int yc){

	putpixel(xc+x,yc+y,1);
	putpixel(xc-x,xc+y,2);
	putpixel(xc-x,yc-y,3);
	putpixel(xc+x,yc-y,4);

	// next 4 will be opposite of above 4, but sign will be preserved

	putpixel(xc+y,yc+x,1);
	putpixel(xc-y,yc+x,2);
	putpixel(xc-y,yc-x,3);
	putpixel(xc+y,yc-x,4);

}
