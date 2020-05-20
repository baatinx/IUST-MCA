#include"stdio.h"
#include"conio.h"
#include"math.h"
#define e 0.001
#define f(x) x*x*x -4*x +1
#define df(x) 3*x*x-4

void main(){
	float x0,x1,f0,f1,df0;
	int i=0;
	clrscr();
	printf("enter the value of x0\n");
	scanf("%f",&x0);
	clrscr();
	do{
		f0=f(x0);
		df0=df(x0);
		x1=x0-(f0/df0);
		f1=f(x1);
		x0=x1;
		i++;
		printf("iteration=%d \t root=%f \t value of function=%f \n",i,x1,f1);
	}while(fabs(f1)>e);
	getch();
}