#include"stdio.h"
#include"conio.h"
#define SIZE 4
int sum(int arr[]);

void main(){
	int at[SIZE] = { 0, 6, 10, 15 };

	int bt[SIZE] = { 10, 12, 15, 1 };

   //	int bt[SIZE] = { 2, 1, 1, 1 };

	int tsb[SIZE] = { 0, 0, 0, 0 };
	int wait[SIZE] = { 0, 0, 0, 0 };
	int tse[SIZE] = { 0, 0, 0, 0 };
	int tat[SIZE] = { 0, 0, 0, 0 };
	int idle[SIZE] = { 0, 0, 0, 0 };

	int i = 0;
	clrscr();
	printf("AT \t BT \t TSB \t WAIT \t TSE \t TAT \t Idle Time\n");

	tsb[i] = 0;
	wait[i] = tsb[i] -  at[i];

	tse[i] = tsb[i] + bt[i];

	tat[i] = tse[i] - at[i];

	idle[i] = 0;

	printf("%d \t %d \t %d \t %d \t %d \t %d \t %d \n",at[i],bt[i],tsb[i], wait[i], tse[i], tat[i], idle[i]);

	for(i = 1; i < SIZE; i++ ){
		// determine  value for tsb
		//******************************

		if( tse[i-1] > at[i] )
			tsb[i] = tse[i-1];
		else
			tsb[i] = at[i];

		//*******************************

		wait[i] = tsb[i] - at[i];
		tse[i] = tsb[i] + bt[i];

		tat[i] = tse[i] - at[i];


		// detemine whether idle time exists or not

		if( tse[i-1] > tse[i] )  {
			// no idle time exists then
			idle[i] = 0;
		}else{
			//calculate idle time
			idle[i] = tsb[i] - tse[i-1];

		}

		printf("%d \t %d \t %d \t %d \t %d \t %d \t %d \n",at[i],bt[i],tsb[i], wait[i], tse[i], tat[i], idle[i]);


	}

	int sum = wait[0] + wait[1] + wait[2] + wait[3];

	int awt = sum / SIZE;

	sum = idle[0] +  idle[1] + idle[2] + idle[3];

	int 	ait = sum / SIZE;

	printf("\n \nAverage Waiting Time  : %d \n", awt);

	printf("Average Idle Time : %d ", ait);




	getch();

}
