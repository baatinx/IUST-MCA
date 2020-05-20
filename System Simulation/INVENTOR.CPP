#include"stdio.h"
#include"conio.h"
#define SIZE 6
int sum(int [], int);
void main(){
	int supply, investments, selling_price, cost, profit, scrap_value;
	int demand[6] = { 30, 55, 60, 90, 80, 20 };

	int revenue[6] = { 0, 0, 0, 0, 0, 0 };
	int scrap[6] =  { 0, 0, 0, 0, 0, 0 };
	int loss[6] = { 0, 0, 0, 0, 0, 0 };
	int net_profit[6] = { 0, 0, 0, 0, 0, 0 };

	int t = 6;
	clrscr();

	supply = 60;
	selling_price = 13;
	cost = 10;
	investments = supply * cost;
	profit = selling_price - cost;
	scrap_value = 2;

	for( int i = 0; i < t; i++){
		if(demand[i] < supply){
			revenue[i] = demand[i] * selling_price;
			scrap[i] = ( supply - demand[i] ) * scrap_value;
		}else{
			revenue[i] = supply * selling_price;
			loss[i] = ( demand[i] - supply ) * profit;
		}

		net_profit[i] = ( revenue[i] + scrap[i]  - investments - loss[i] );
	}

	printf("Demand \t Investments \t Revenue \t Scrap  \t loss \t PROFIT\n");
	for( int j = 0; j < t; j++){
		printf("%d \t %d \t\t %d \t\t %d \t\t %d \t %d \n",demand[j], investments, revenue[j], scrap[j], loss[j], net_profit[j] );
	}

	printf("\n\nNET Profit / Loss : %d", sum(net_profit, SIZE));
	getch();
}

int sum(int arr[], int size){
	int sum = 0;

	for(int i = 0; i < size; i++)
		sum = sum + arr[i];

	return sum;

}