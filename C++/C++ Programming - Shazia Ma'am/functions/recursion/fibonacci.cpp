#include <iostream>

using std::cout;
using std::cin;
using std::endl;

long fibonacci(long n){
  if(n == 0 || n == 1){
    return n;
  }

  return fibonacci(n - 1) + fibonacci(n - 2);
}

int main(){

  for(int i{0}; i < 10; i++){
    cout << "fib(" << i << ") = " << fibonacci(i) << endl;
  }

  return 0;
}
