#include <iostream>
#include <string>
#include "car3.h"

using namespace std;

int main(){
  Car car{"Honda Brio", -10};
  cout << "My car started at speed "
       << car.getSpeed()
       << endl;
  car.accelerate(5);
  cout << "Now my car is running at "
       << car.getSpeed()
       << endl;
  return 0;
}


