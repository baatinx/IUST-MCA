#include<stdio.h>
#include<conio.h>

		 /******************************************************/
		 /** please do not edit the code, thank you, in advance */
int arr[20],n;
void get_array();
void put_array();
void frequency();
int check(int element,int pos);
void main(){
	clrscr();
	printf("enter the size of array\t");
	scanf("%d",&n);
	clrscr();
	get_array();
	put_array();
	frequency();
	getch();
}
void get_array(){
	int i;
	for(i=0;i<n;i++){
		printf("enter the %d element\t",i+1);
		scanf("%d",&arr[i]);
		clrscr();
	}
}
void put_array(){
	int i;
	printf("array elements are as follows:\n");

	for(i=0;i<n;i++)
		printf("%d. =>\t%d\n",i+1,arr[i]);
}
void frequency(){
	int i,j,k,element,pos,freq=0;
	for(i=0;i<n;i++){
		element=arr[i];
		pos=i;
		if(check(element,pos)){
			for(j=0;j<n;j++){
				if(arr[j]==element)
					freq++;
			}
		printf("frequency of %d is %d\n",element,freq);
		freq=0;
		}
	}
}
int check(int element, int pos){
	int i,flag=0;
	if(pos!=0){
		for(i=0;i<pos;i++){
			if(arr[i]==element){
				flag=1;
			}
		}
	}
	if(flag==1)
		return 0;
	else
		return 1;
}

