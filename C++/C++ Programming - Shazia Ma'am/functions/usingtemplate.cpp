#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::endl;

template <typename T> T add(T a, T b){
  return a + b;
}

template <> float add(float a, float b){
  cout << "(explicit specialization) ";
  return a + b;
}

int main(){
  cout << "Adding two doubles " << add(2.5, 5.6) << endl;
  cout << "Adding two ints " << add(4, 5) << endl;
  cout << "Adding two strings " << add(std::string("Hello "), std::string("World")) << endl;
  cout << "Adding float explicity " << add(4.5f, 6.7f) << endl;
  return 0;
}
