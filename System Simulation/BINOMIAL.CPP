#include"stdio.h"
#include"conio.h"

int fact(int);
void main(){
		int n = 10; // tossing a coin 10 times
		int k = 6; // probability of getting 6 heads?

		float p = 1/2; // prob. of success;
		float q = 1/2; // prob. of failure;
		clrscr();

		printf("%d", fact(9));
		getch();
		}

int fact(int num ){
	int fact = 1;
	if(num == 0 || num == 1){
	return 1;

	while(num != 5 ){
		fact = fact * num;
		num --;
		printf("skjdfh");
	}

	return fact;
}







}
