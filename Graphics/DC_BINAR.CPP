#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<math.h>
#include<dos.h>
#define size 10
int dcbinary(int arr[],int low,int high,int key);
		    /******************************************************/
		    /** please do not edit the code, thank you, in advance */
void main(){

	int arr[size],n,i,low,high,key;
	clrscr();
	printf("enter the size of array\n");
	scanf("%d",&n);
	clrscr();
	for(i=0;i<n;i++){
		printf("Enter %d element\n",i+1);
		scanf("%d",arr[i]);
		clrscr();
	}
	printf("enter the key element you want to search in the array\n");
	scanf("%d",&key);
	clrscr();

	low=0;
	high=n-1;

	if(  dcbinary(arr,low,high,key)    )
		printf("search is sucessfull");
	else
		printf("search is unsucessfull");

	getch();
}


int dcbinary(int arr[],int low,int high,int key){
int mid;

	printf("key = %d , low= %d high = %d mid = %d",key,low,high, mid);
	if(high==0){
		if(arr[low]==key)
			return 1;
		else
			return 0;
	}else{
		while(low<high)
		{
			mid=(low+high)/2;
			printf("key = %d , low= %d high = %d mid = %d\n",key,low,high, mid);
			if(mid==key)
				return 1;
			else{
				if(arr[mid]<key)
					low=mid+1;
				else
					high=mid-1;
			}

				printf("key = %d , low= %d high = %d mid = %d",key,low,high, mid);
		}
	}

	printf("key = %d , low= %d high = %d mid = %d",key,low,high, mid);
	 return 0;
}