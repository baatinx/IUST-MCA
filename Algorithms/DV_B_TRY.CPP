#include"stdio.h"
#include"conio.h"
#define size 20

int dcbinary(int arr[],int low,int high,int key);

void main(){

	int arr[size],low,high,key,flag,i,n;
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

	flag=dcbinary(arr,low,high,key);
	if(flag!=-1){
		printf("search is sucessfull, element is found is at index  %d",flag);
	}else{
		printf("search is unsucessfull");
	}
	getch();
}

int dcbinary(int arr[],int low, int high,int key){
	if(high==low){
		if(arr[high]==key)
			return low;
		else
			return -1;
	}else{
		int mid;
		mid= (low+high)/2;

		if(arr[mid]==key){
			  return mid;
		}else{
			if(key>arr[mid])
				 return dcbinary(arr,mid+1,high,key);
				else
				return dcbinary(arr,low,mid-1,key);
		}
	}
}
