#include"stdio.h"
#include"conio.h"
#include"graphics.h"
#include"stdlib.h"
#include"dos.h"

void translate_pixel();
void translate_line();

void main(){
	int choice;
	clrscr();
	printf("1. for translate a pixel\n2. for tanslate a line\n");
	printf("enter your choice\n");
	scanf("%d",&choice);
	switch(choice){
		case 1:
			translate_pixel();
			break;
		case 2:
			translate_line();
			break;
		default:
			printf("please provide a valid input n try again");
			getch();
			exit(1);
	}
	getch();
}

void translate_pixel(){
	int p[2][1];
	int t[2][1];
	int gd=DETECT,gm;

	clrscr();
	printf("enter the point's co-ordinate(X,Y)\n");
	scanf("%d %d",&p[0][0],&p[1][0]);
	clrscr();

	printf("enter the translation points(Tx,Ty)\n");
	scanf("%d %d",&t[0][0],&t[1][0]);
	clrscr();

	initgraph(&gd,&gm,"C:\\TC\\BGI");
	putpixel(p[0][0],p[1][0],WHITE);

	p[0][0]=p[0][0]+t[0][0];
	p[1][0]=p[1][0]+t[1][0];

	putpixel(p[0][0],p[1][0],RED);

}

void translate_line(){
	int p[2][2];
	int t[2][1];
	int gd=DETECT,gm;

	clrscr();
	printf("enter the point's co-ordinate(X1,Y1)\n");
	scanf("%d %d",&p[0][0],&p[1][0]);
	clrscr();

	printf("enter the point's co-ordinate(X2,Y2)\n");
	scanf("%d %d",&p[0][1],&p[1][1]);
	clrscr();

	printf("enter the translation points(Tx,Ty)\n");
	scanf("%d %d",&t[0][0],&t[1][0]);
	clrscr();

	initgraph(&gd,&gm,"C:\\TC\\BGI");
	line(p[0][0],p[1][0],p[0][1],p[1][1]);

	p[0][0]=p[0][0]+t[0][0];
	p[1][0]=p[1][0]+t[1][0];

	p[0][1]=p[0][1]+t[0][0];
	p[1][1]=p[1][1]+t[1][0];

	line(p[0][0],p[1][0],p[0][1],p[1][1]);

}