#include <iostream>
#include <string>

class Named {
 public:
  // Pure virtual function.
  virtual const std::string& getName() const = 0;
};

class Eatable : public Named {
 public:
  // Pure virtual function
  virtual int getCalories() = 0;
};

// Public interitance and hence a "as a relationship"
class Animal : public Named {
 public:
  Animal(const std::string &name);

  // This is a non virtual function
  void breathe();

  void eat(Eatable* eatable);

  // This is a pure virtual function
  virtual void speak() = 0;

  const std::string& getName() const;

 private:
  std::string name;
};

class Cat : public Animal {
 public:
  Cat(const std::string &name);

  // Virtual method from Animal
  void eat(Eatable* eatable);

  // Pure virtual method inherited
  void speak();
};


class Hen : public Animal, public Eatable {
 public:
  Hen(const std::string &name, int calories);

  // Virtual method inherited from Animal.
  void speak();

  // Virtual method inherited from Eatable.
  int  getCalories();

  // There are two getName() methods inherited
  // One from Animal and one from Eatable.
  const std::string& getName() const;

  // Breath
  void breathe();
  
 private:
  int calories;
};


  
