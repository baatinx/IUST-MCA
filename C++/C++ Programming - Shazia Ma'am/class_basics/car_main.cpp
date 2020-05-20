#include <iostream>
#include <string>
#include "car.h"

int main(){
  // We create an instance of a car.
  // We have included the definition of car class
  // from the "car.h" header file.
  Car car;
  
  // This is a C++ string far easy to use
  // then the character string. 
  std::string brandName;

  std::cout << "Enter a car brand ? ";
  
  // This is a standard C++ library to get
  // a string input from the standard input device
  std::getline(std::cin, brandName);

  // We access a method from an instance using the
  // dot notation.
  car.setBrand(brandName);

  std::cout << "Car brand is " << car.getBrand() << std::endl;

  return 0;
}

    
