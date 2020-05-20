#include <string>

// Using the keyword class we can create a class
// which a user defined datatype.
//
// A class declaration goes into a header file
//
// Never use a 'using' declarative in a header file
//
class Car {
  // Members that are accessible to rest of the program
public:
  // A public member function to set brand of the car
  void setBrand(std::string carBrand){
    brand = carBrand;
  }

  // A public member function to get brand of the car
  // We declare this function as const as we know it
  // is not going to modify the instance of car that
  // that is calling this function.
  std::string getBrand() const{
    return brand;
  }

  // Members that are accessible to the functions
  // of this class only.
private:
  // A private data member to store brand name
  // for an intance.
  // We are using string class from C++. Now
  // we don't have to worry about the character
  // array size and allocation.
  std::string brand;
};
