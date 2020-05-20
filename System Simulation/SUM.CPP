#include"stdio.h"
#include"conio.h"
void main(){
	int num,dummy_num,r,sum=0;
	clrscr();
	printf("enter the number\t");

	scanf("%d",&num);
	clrscr();
	dummy_num=num;
	while(dummy_num!=0){
		r=dummy_num%10;
		sum=sum+r;
		dummy_num=dummy_num/10;
	}
	printf("sum of numbers is  %d \n",sum);

	getch();

}