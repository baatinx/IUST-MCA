#include"stdio.h"
#include"conio.h"
#define size 20

int dcbinary(int arr[],int low,int high,int key);

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

	if(dcbinary(arr,low,high,key))
		printf("search is sucessfull");
	else
		printf("search is unsucessfull");
	getch();

}

int dcbinary(int arr[],int low, int high,int key){
	if(high==0 && arr[high]==key)
		return 1;
	else{
		int mid;
		while(low<=high)
		{
			mid= (low+high)/2;

			if(arr[mid]==key)
				return 1;
			else{
				if(key>arr[mid])
					low=mid+1;
				else
					high=mid-1;
			}
		}
	}
	return 0;
}
