#include <iostream>

using namespace std;

int increment_counter(){
  static int counter = 0;
  counter++;
  return counter;
}

int false_increment_counter(){
  int counter = 0;
  counter++;
  return counter;
}

int main(){
  cout << "Staitc increment " << increment_counter() << endl;
  cout << "Static increment " << increment_counter() << endl;

  cout << "Auto increment " << false_increment_counter() << endl;
  cout << "Auto increment " << false_increment_counter() << endl;
  
  return 0;
}
