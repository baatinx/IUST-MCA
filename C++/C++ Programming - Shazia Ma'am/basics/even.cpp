#include <iostream>

using namespace std;

int main(){
  int value;

  cout << "Enter a number ? ";
  cin >> value;

  if(value % 2 == 0){
    cout << value << " is even" << endl;
  }else {
    cout << value << " is odd" << endl;
  }

  return 0;
}
