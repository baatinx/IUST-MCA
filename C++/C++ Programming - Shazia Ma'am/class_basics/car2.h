#include <string>

class Car {
 public:
  // We are now going to use a constructor. A constructor
  // is a special function which is called when we create
  // a new instance of a class. Constructors can take
  // arguments. We can initialize the data members by
  // using the member initializers like we are initializing
  // brand. We use explicit to tell the compiler not to
  // use this constructor for type conversion. (Later about that)
  explicit Car(std::string brandName):brand{brandName} {
  }
  
  std::string getBrand() const {
    return brand;
  }
  
  void setBrand(std::string brandName){
    brand = brandName;
  }
  
 private:
  std::string brand;
};
