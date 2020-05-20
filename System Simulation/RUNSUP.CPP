#include"stdio.h"
#include"conio.h"
#include"math.h"
int getRuns(double arr[], int size);

void main(){

	double arr[10] = { 0.12, 0.01, 0.23, 0.28, 0.89, 0.31, 0.64, 0.25, 0.33, 0.93 };
	double meanA= 0, sigmaA2 = 0, z0 = 0, alpha = 1.96;
	int runs = getRuns(arr, 3);
	int i = 1, N = 10;

	clrscr();

	for(i = 0; i < 10; i++)
		printf("%.3f \t", arr[i]);

	meanA=( ( (double)2 * (double)N ) - 1 ) / 3;

	printf("Runs \t = \033[1;31m %d \033[0m \n",runs);
	printf("N \t = \033[1;31m %d \033[0m \n",N);

	printf("Mean \t = \033[1;31m %.3f \033[0m \n",meanA);

	sigmaA2=( ( (double)16 * (double)N ) - 29 ) / 90;

	printf("Sigma \t = \033[1;31m %.3f \033[0m \n",sigmaA2);

	z0 =  ( (double)runs - meanA ) / sqrt( sigmaA2 );

	printf("Z0 \t = \033[1;31m %.3f \033[0m \n\n\n",z0);

	printf("-Z \t\t Z0 \t\t +Z \n");
	printf("%.3f \t\t %.3f \t %.3f\n\n",alpha*-1,z0,alpha);



	if( ( z0 >= (alpha * -1 ))  && (z0 <= alpha) )
		printf("\033[1;32m H0 is not rejected \033[0m \n\n");
	else
		printf("\033[1;31m H0 is  rejected \033[0m \n\n");

getch();
}




int getRuns(double arr[], int size){
	return 6;
}