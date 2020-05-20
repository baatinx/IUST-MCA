#include <iostream>

using std::cout;
using std::cin;
using std::endl;

class Car {
public:
  void accelerate(int increase);
  int getSpeed() const;

private:
  int speed;
};

void Car::accelerate(int increase){
  speed += increase;
}

int Car::getSpeed() const {
  return speed;
}

void callByValue(Car c){
  c.accelerate(10);
}

void callByReference(Car &c){
  c.accelerate(10);
}

void callByConstantReference(const Car &c){
  cout << "As I am a constant reference, I can access speeed " << c.getSpeed()
       << "\nBut I can't change it" << endl;
  //c.accelerate(10);
}

int main(){
  Car c;

  callByValue(c);
  cout << "After call by value, Car is speeding at " << c.getSpeed() << endl;
  
  callByReference(c);
  cout << "After call by refernece, Car is speeding at " << c.getSpeed() << endl;
  
  callByConstantReference(c);
  
  return 0;
}
