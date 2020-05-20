#include <string>

//
// We have added another data member speed
// and added a set and get parameter.
//
class Car {
 public:
  explicit Car(std::string brandName, int initialSpeed);

  std::string getBrand() const;

  void setBrand(std::string brandName);

  int getSpeed() const;

  void accelerate(int increment);
  
 private:
  std::string brand;

  int speed;
};
