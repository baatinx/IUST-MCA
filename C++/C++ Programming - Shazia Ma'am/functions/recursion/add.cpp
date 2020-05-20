#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int add(int x, int y){
  if(x == 0){
    return y;
  }else {
    return 1 + add(x - 1, y);
  }
}

int main(){
  cout << "Using recursion sum of 10 and 20 is " <<  add(10, 20)
       << endl;

  return 0;
}
