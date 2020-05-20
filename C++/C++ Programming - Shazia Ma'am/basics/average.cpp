#include <iostream>
#include <iomanip>

using std::cout;
using std::endl;
using std::cin;

int main(){

  cout << "Enter numbers (EOF to stop) ? " << endl;

  int value;
  int sum = 0;
  int count = 0;
  
  while( cin >> value ){
    sum += value;
    count += 1;
  }

  float average{static_cast<float>(sum)/count};

  cout << "The average is = " << std::setprecision(2) << std::fixed << average << endl;

  return 0;
}
