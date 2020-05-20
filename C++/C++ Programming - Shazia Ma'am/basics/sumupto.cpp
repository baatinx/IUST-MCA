#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int main(){
  int num;
  
  cout << "Enter a number ? " << endl;
  cin >> num;

  int sum{0};
  for(int i{1}; i <= num; i++){
    sum += i;
  }

  cout << "Sum upto " << num << " is " << sum << endl;
  return 0;
}
