#include"stdio.h"
#include"conio.h"

void main(){
	int rem,i,j,temp;
	int arr[8]={0,0,0,0,0,0,0,0};
	long int seed,num,rand ;
	clrscr();

	printf("enter the seed\t");
	scanf("%ld",&seed);
	clrscr();

	num=seed*seed;
	printf("square of the seed is %ld \n\n",num);

	i=-1;
	// insert the digits in an array in reverse order
	while(num!=0){
		rem=num%10;
		arr[++i]=rem;
		num=num/10;
	}

	//reverse the array elements
	j=0;
	while(j<i){
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		i--;
		j++;
	}


	printf("array representation of number is : \n");

	for(i=0;i<8;i++)
		printf("arr[%d] = %d\n",i,arr[i]);


	//extract middle four digits from array and make it single number

	num=0;
	for(i=2;i<=5;i++){
	num=(num*10)+arr[i];
	}

	seed=num;
	rand=num/1000;
	printf("num=%d    rand = %d",seed,rand);

	getch();

}