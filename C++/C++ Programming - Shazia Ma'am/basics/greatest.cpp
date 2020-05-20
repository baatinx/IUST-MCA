#include <iostream>

// Instead of prefixing standard io functions & variables
// we using 'using' declarative. This allows us to use
// cout, endl etc without a prefix.
using namespace std;

int main(){
  int a;
  int b;
  int c;

  cout << "Enter three numbers" << endl;
  cin >> a >> b >> c;

  int greatest;
  if(a > b){
    if(a > c){
      greatest = a;
    }else {
      greatest = c;
    }
  }else {
    if(b > c){
      greatest = b;
    }else {
      greatest = c;
    }
  }

  cout << "Greatest among these numbers is "
       << greatest
       << endl;

  return 0;
}
