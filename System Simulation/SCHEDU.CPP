#include<stdio.h>
#include<conio.h>
#define SIZE 5
		   /******************************************************/
		   /** please do not edit the code, thank you, in advance */
void main(){
	int arr[SIZE][SIZE];
	int i,j;
	clrscr();

	printf("enter the process id\n");
	for(i=0;i<SIZE;i++)
		scanf("%d",&arr[i][0]);

	printf("\nenter the brust time of the process\n");
	for(i=0;i<SIZE;i++)
		scanf("%d",&arr[i][1]);

	printf("\nenter the arrival of the process\n");
	for(i=0;i<SIZE;i++)
		arr[i][2]=0;
	int prev=0;

	for(i=0;i<SIZE;i++)
	{
		arr[i][3]=prev+(arr[i][1])  ;
		prev=arr[i][3];
	}


	for(i=0;i<SIZE;i++)
	{
		arr[i][4]=arr[i][3] - arr[i][1];
	}
	clrscr();
	for(i=0;i<SIZE;i++)
	{
		for(j=0;j<SIZE;j++)
		{
			 printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}


	getch();
}
