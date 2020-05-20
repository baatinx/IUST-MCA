#include <iostream>

using std::cout;
using std::cin;
using std::endl;

void swap(int &x, int &y){
  int temp = x;
  x = y;
  y = temp;
}

int main(){
  int x = 666;
  int y = 999;

  cout << "x = " << x << ", y = " << y << endl;

  swap(x, y);

  cout << "After swap" << endl;
  cout << "x = " << x << ", y = " << y << endl;

  return 0;
}
