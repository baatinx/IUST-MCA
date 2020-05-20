#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int square(int side){
  return side * side;
}

double square(double side){
  return side * side;
}

int maximum(int a, int b){
  return a < b ? b : a;
}

int maximum(int a, int b, int c){
  return a > b ? maximum(a, c) : maximum(b, c);
}

void confusing(int a, double b){
}

void confusing(double a, int b){
}

void play(const double &a){
  cout << "play const " << endl;
  //You can't do this!
  //a = 10.0;
}

void play(double &a){
  cout << "play" << endl;
  a = 10.0;
}

int main(){
  cout << square(100) << endl;
  cout << square(20.0) << endl;
  cout << maximum(10, 20) << endl;
  cout << maximum(12, 15, 20) << endl;

  //It will confuse
  //!confusing(10, 10);

  confusing(10, 10.0);
  confusing(10.0, 10);

  double a = 20;
  play(20);
  play(a);
  
  return 0;
}

