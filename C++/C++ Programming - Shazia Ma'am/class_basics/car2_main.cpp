#include <iostream>
#include <string>
#include "car2.h"

using namespace std;

int main(){
  // This will call the default constructor. In case
  // a class doesn't have a default constructor the
  // compiler creates a default constructor with no
  // arguments.
  // Here our constructor takes a single string argument
  // which is initialized to the brand string we pass to
  // the list initializer.
  Car car{"Honda Brio"};

  // We can no longer use
  // Car car
  // as it invokes a constructor with no parameters
  // earlier car didn't have a constructor, so compiler
  // had created one for it with no arguments and so
  // the above call was possible.
  
  cout << "My car was " << car.getBrand() << endl;
  car.setBrand("Maruti Baleno");
  cout << "My car is now " << car.getBrand() << endl;

  return 0;
}


