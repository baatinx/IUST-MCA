#include"stdio.h"
#include"conio.h"
#define SIZE 100

void main(){
	int arr[SIZE],upperBound,index,i,flag=1;
	clrscr();
	printf("enter upper bound\t");
	scanf("%d",&upperBound);
	clrscr();
	for(i=0;i<upperBound;i++)
		scanf("%d",&arr[i]);

	clrscr();

	printf("list before sorting\n");
	for(i=0;i<upperBound;i++)
		printf("%d. ====>\t%d\n",i+1,arr[i]);

	for(index=0;index<upperBound;index++){
		if(flag==1){
			i=index+1;
			flag=0;
		}
		if(arr[index]>arr[i]){
			int temp=arr[index];
			arr[index]=arr[index+1];
			arr[index+1]=temp;
		}
		i++;
		if(index<upperBound-1 && i<upperBound) {
			index=index-1;
		}

		if(i==upperBound){
			flag=1;
			printf("akdfja sdf");
			}

	}

	printf("list after sorting\n");
	for(i=0;i<upperBound;i++)
		printf("%d. ====>\t%d\n",i+1,arr[i]);



	printf("loope eixt");
	getch();

}
