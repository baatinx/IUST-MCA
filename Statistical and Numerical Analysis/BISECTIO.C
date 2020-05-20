#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<math.h>

#define e 0.001
#define f(x) x*x*x -4*x +1

int main(){
	float x0,x1,x2,f0,f1,f2;
	int i=0;
	system("cls");
	printf("bisection method \n");
	printf("enter the value of x0 and x1\t");
	scanf("%f %f",&x0,&x1);
	system("cls");
	do{
		f0=f(x0);
		f1=f(x1);
		x2=(x0+x1)/2;
		f2=f(x2);
		if(f0*f2<0)
			x1=x2;
		else
			x0=x2;
		i++;
		printf("iteration = %d\t",i);
		printf("root = %f and value of function is %f\n",x2,f2);

	}while(fabs(f2)>e);
	getch();
	return 1;
}
