#include <iostream>

using std::cout;
using std::cin;
using std::endl;

void drawLine(int length = 50, char c = '-'){
  for(int i{0}; i < length; i++){
    cout << c;
  }
  cout << endl;
}

int main(){
  drawLine();
  drawLine(80);
  drawLine(70, '*');
  return 0;
}
