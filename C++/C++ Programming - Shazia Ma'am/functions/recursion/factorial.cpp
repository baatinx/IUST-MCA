#include <iostream>


using std::cout;
using std::cin;
using std::endl;

long factorial(long n){
  if(n == 0){
    return 1;
  }

  return n * factorial(n - 1);
}

int main(){
  cout << "Factorial of 10 is " << factorial(10) << endl;
  return 0;
}
