#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<math.h>

#define PI 3.14

void main()
{
	int choice,type,a,b;
	float x;
	char y_n;
	do{
	clrscr();
	printf("Select your choice.\n");
	printf("1. - standard calculator.\n");
	printf("2. - scientific calculator.\n\n");
	printf("0. - exit\n");
	printf("Enter your choice : ");
	scanf("%d",&type);
	if(type==0)
		exit(0);
	if(type==1)
	{
		clrscr();
		printf("Select operation.\n");
		printf("1. - Addition (+)\n");
		printf("2. - Subtraction (-)\n");
		printf("3. - Multipilication (*)\n");
		printf("4. - Interger Division (/)\n");
		printf("5. - Modulus Division (%)\n");
		printf("6. - Square Root(X)\n");
		printf("7. - Square(X)\n");
		printf("8. - Cube(X)\n\n");
		printf("0. - Exit\n\n");
		printf("Enter your choice : \t");
		scanf("%d",&choice);

		if(choice==0)
			exit(0);

		clrscr();
		if(choice>=1 && choice<=5)
		{
			printf("Enter first number : ");
			scanf("%d",&a);
			clrscr();
			printf("Enter second number : ");
			scanf("%d",&b);
			clrscr();
			switch(choice)
			{
				case 1:
					printf("%d + %d = %d",a,b,a+b);
					break;
				case 2:
					printf("%d - %d = %d",a,b,a-b);
					break;
				case 3:
					printf("%d * %d = %d",a,b,a*b);
					break;
				case 4:
					printf("%d / %d = %d",a,b,a/b);
					break;
				case 5:
					printf("%d % %d = %d",a,b,a%b);
					break;
			}
		}
		else if(choice>=6 && choice<=8)
		{
			printf("Enter a number : ");
			scanf("%d",&a);
			clrscr();
			switch(choice)
			{
				case 6:
					int result=sqrt(a);
					printf("sqrt(%d) = %d",a,result);
					break;
				case 7:
					printf("square(%d) = %d",a,a*a);
					break;
				case 8:
					printf("cube(%d) = %d",a,a*a*a);
					break;
				case 9:
				     //	div(a,b);
					break;
			}
		}
	}
	else if (type==2)
	{
		clrscr();
		printf("Select operation.\n");
		printf("1. - sine()\n");
		printf("2. - cosine()\n");
		printf("3. - tangent()\n");
		printf("4. - cosec()\n");
		printf("5. - sec()\n");
		printf("6. - cot()\n");
		printf("7. - log()\n");
		printf("8. - log10()\n\n");
		printf("0. - Exit\n\n");
		printf("Enter your choice : \t");
		scanf("%d",&choice);

		if(choice==0)
			exit(0);
		clrscr();
		printf("Enter a number : ");
		scanf("%f",&x);
		clrscr();
		switch(choice)
		{
			case 1:
				printf("sine(%f) = %f",x,sin(x));
				break;
			case 2:
				printf("cos(%f) = %f",x,cos(x));
				break;
			case 3:
				printf("tan(%f) = %f",x,tan(x));
				break;
			case 4:
				printf("cosec(%f) = %f",x,sinh(x));
				break;
			case 5:
				printf("sec(%f) = %f",x,cosh(x));
				break;
			case 6:
				printf("cot(%f) = %f",x,tanh(x));
				break;
			case 7:
				printf("log(%f) = %f",x,log(x));
				break;
			case 8:
				printf("log10(%f) = %f",x,log10(x));
				break;

	       }
	}

	printf("\nDo you want to exit the program? (y/n):  ");
	scanf("%s",&y_n);
       }while(y_n=='n');
}