#include"stdio.h"
#include"conio.h"
#define size 20

void dcquick(int arr[],int low,int high);

void main(){
	int arr[size],low,high,key,i,n;
	clrscr();
	printf("enter the size of array\n");
	scanf("%d",&n);
	clrscr();

	for(i=0;i<n;i++){
		printf("enter %d element\n",i+1);
		scanf("%d",&arr[i]);
		clrscr();
	}

	low=0;
	high=n-1;

	dcquick(arr,low,high,key);
	getch();
}

void dcbinary(int arr[],int low, int high,int key){
	int pivot,i,j;
	pivot=low;
	i=low;
	j=high;
	if(low<high){
		while(i<dj){
			if


		}
	}
}