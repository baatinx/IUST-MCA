#include"stdio.h"
#include"conio.h"
#define size 20

void dcquick(int arr[],int low,int high);
void getarray(int arr[],int n);
void putarray(int arr[],int n);
void swap(int arr[], int i,int j);

void main(){
	int arr[size],low,high,key,i,n;
	clrscr();
	printf("enter the size of array\n");
	scanf("%d",&n);
	clrscr();

	getarray(arr,n);
	putarray(arr,n);

	low=0;
	high=n-1;

	dcquick(arr,low,high);
	getch();

}

void getarray(int arr[],int n){
	int i;
	for(i=0;i<n;i++){
		printf("enter %d element\n",i+1);
		scanf("%d",&arr[i]);
		clrscr();
	}

}
void putarray(int arr[],int n){
	int i;
	for(i=0;i<n;i++)
		printf("%d. ==>> %d\t",i+1,arr[i]);

}

void dcquick(int arr[],int low, int high){

	if(low<high)
	{

	int pivot,i,j;
	pivot=high;
	i=low;
	j=high;
	while(low<high){
		while(arr[i]<arr[pivot])
			i++;

		while(arr[j]>arr[pivot])
			j--;
		if(i<j)
			swap(arr,i,j);
	}
	swap(arr,i,pivot);
	putarray(arr,high);
}

}
void swap(int arr[],int i,int j){
	int temp;
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;


}