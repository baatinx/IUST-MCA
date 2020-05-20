#include <iostream>

using std::endl;
using std::cout;
using std::cin;

int main(){
  int x{20};
  int& y = x;

  cout << "The value of x is " << x << endl;
  y = 100;
  cout << "The value of x is now " << x << endl;

  return 0;
}
