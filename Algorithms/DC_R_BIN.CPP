#include"stdio.h"
#include"conio.h"
#define size 20

void dcbinary(int arr[],int low,int high,int key);

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

	printf("enter the key element you want to search in the array\n");
	scanf("%d",&key);
	clrscr();

	low=0;
	high=n-1;

	dcbinary(arr,low,high,key);
	getch();
}

void dcbinary(int arr[],int low, int high,int key){
	if(high==low){
		if(arr[high]==key){
			printf("search is sucessfull");
			return;
		}else{
			printf("search is unsucessfull");
			return;
		}
	}
	if(low>high){
		  printf("search is unsucessfull");
		  return;
	}
	else{
		int mid;
		mid= (low+high)/2;

		if(arr[mid]==key){
			  printf("search is sucessfull");
			  return;
		}else{
			if(key>arr[mid])
				dcbinary(arr,mid+1,high,key);
				else
				dcbinary(arr,low,mid-1,key);
			}
	}

}
