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

		sum=  sum*10    +r;

		dummy_num=dummy_num/10;
	}
	printf("reverse is %d \n",sum);

	dummy_num=num ;
	sum=0;

	dummy_num=dummy_num/10;

	r=dummy_num%10;
	sum=sum*10+r;
	dummy_num=dummy_num/10;

	r=dummy_num%10;
	sum=sum*10+r;
	dummy_num=dummy_num/10;

	sum=sum+10;

	printf("sum 2 ====> %d",sum);

	getch();
}