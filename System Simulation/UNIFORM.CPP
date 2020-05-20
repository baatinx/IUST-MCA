#include"stdio.h"
#include"conio.h"

void main(){

	int a,xi,xi1,c,m,counter,choice;
	int arr[11] = { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };
	a = 2;
	xi = 1;
	c = 8;

	do{

	clrscr();
	printf("Enter value of m \t");
	scanf("%d",&m);
	clrscr();

	printf("A \t Xi \t C \t M \t\t\t X(i+1) \n");

	do{
		xi1 = ( (a * xi) + c) % m ;

		printf("%d \t %d \t %d \t %d \t\t\t %d \n",a,xi,c,m,xi1);

		if(arr[xi1] == 1)
			break;
		xi=xi1;
		arr[xi1]++;
	}while(1) ;

	printf("\n\nDo you want to exit?\n1 -> exit\n0 -> continue. ");
	scanf("%d",&choice);
       }while(choice != 1);

}