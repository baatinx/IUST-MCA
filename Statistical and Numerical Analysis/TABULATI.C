#include"stdio.h"
#include"conio.h"
float tab(float x){
	float y;
	y=x*x-100;
	return y;
}
void main(){
	int  x=0;
	clrscr();
	while(x<=20){
	       printf("x=%d\tf(%d)= %f\n",x,x,tab(x));
		x++;
	}
	getch();

}