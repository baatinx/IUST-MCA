#include"stdio.h"
#include"conio.h"


void main(){

	double arr[7] = { 0.1, 0.3, 0.5, 0.54, 0.72, 0.81, 0.91 };

       //	double arr[7] = { 0.1, 0.3, 0.5, 0.54, 0.72, 0.81, 0.91 };


	double dPlus = 0, dMinus = 0, dMax, Rin, dAlpha = 0.48343 ;

	int i = 1, N = 7;
	clrscr();

	printf("\033[1;31m I \033[0m \t");
	for(i = 1; i <= 7; i++)
		printf("%d \t",i);

	printf("\n\n");
	printf("\033[1;31m R(i) \033[0m \t");

	for(i = 0; i < 7; i++)
		printf("%.3f \t",arr[i]);

	// code for D+
	printf("\n\n");
	printf("\033[1;31m D+ \033[0m \t");

	i = 1; // reset i;

	dPlus =( (float)i / (float)N ) - ( arr[i - 1] );
	i++;
	printf("%.3f \t",dPlus);

	for( ; i <= 7; i++) {
		float temp = ( (float)i / (float)N ) - ( arr[i - 1] );
		printf("%.3f \t",temp);

		if(temp > dPlus)
			dPlus = temp;
	}

	// code for D-

	printf("\n\n");
	printf("\033[1;31m D- \033[0m \t");

	i = 1; // reset i;

	dMinus = ( (arr[i - 1])  - ( (float)(i - 1) / (float)(N) ) );
	i++;
	printf("%.3f \t",dMinus);

	for( ; i <= 7; i++) {
		float temp = ( (arr[i - 1])  - ( (float)(i - 1) / (float)(N) ) );
		printf("%.3f \t",temp);

		if(temp > dMinus)
			dMinus = temp;
	}




	// rest code
	dMax = (dPlus > dMinus) ? dPlus : dMinus ;

	printf("\n\n\n\n");
	printf(" D+MAx() = \033[1;31m %.3f \033[0m \n",dPlus);
	printf(" D-MAx() = \033[1;31m %.3f \033[0m \n\n",dMinus);
	printf(" DMAx()  = \033[1;31m %.3f \033[0m \n\n",dMax);
	printf(" D Alpna = \033[1;31m %.5f \033[0m \n\n",dAlpha);

	if(dMax <= dAlpha)
		printf("\033[1;32m H0 is not rejected \033[0m \n\n");
	else
		printf("\033[1;31m H0 is rejected \033[0m \n\n");



getch();
}

