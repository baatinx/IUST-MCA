#include "car3.h"

Car::Car(std::string brandName, int initialSpeed)
  :brand{brandName}, speed{initialSpeed}
{
  if(speed < 0){
    speed = 0;
  }
}
  
std::string Car::getBrand() const {
  return brand;
}
  
void Car::setBrand(std::string brandName){
  brand = brandName;
}

int Car::getSpeed() const {
  return speed;
}

void Car::accelerate(int increment){
  speed += increment;
  if(speed < 0){
    speed = 0;
  }
}

