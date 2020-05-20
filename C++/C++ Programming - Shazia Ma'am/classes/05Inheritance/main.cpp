#include <iostream>
#include "animals.h"

using std::cout;
using std::endl;


// This is a simple example of polymorphism.
// The animal can hold instance of any derived
// class and the speak of the right class is
// called based on the instance present in the
// pointer.
void speakLoudly(Animal *animal){
  cout << animal->getName() << " said loudly ";
  animal->speak();
}

// This is an example of polymorphism. The animals
// hold instances of Cats & Hens and when speak
// is called the actual method (implemented by the
// instance class) is called.
void makeNoises(Animal *animals[], int size){
  for(int i = 0; i < size; i++){
    speakLoudly(animals[i]);
  }
}

// As breathe() is not a virtual function
// overriding will not work and only animal::breathe
// will be called.
void takeABreath(Animal *animals[], int size){
  for(int i = 0; i < size; i++){
    animals[i]->breathe();
  }
}

int main(){
  Animal *animal;
  Cat *fatCat;
  Hen *whiteHen;

  animal = new Cat("Cat");
  fatCat = new Cat("FatCat");
  whiteHen = new Hen("White Hen", 200);

  Animal* animals[] {animal, fatCat, whiteHen};

  cout << "* Instance virtual methods get called from "
       << "base class pointers."
       << endl;
  makeNoises(animals, 3);

  cout << endl
       << "* Instance non-virtual functions don't get "
       << "called from base class pointers."
       << endl;
  takeABreath(animals, 3);

  
  cout << endl
       << "* But you can call instance function from "
       << "its own pointer."
       << endl;
  whiteHen->breathe();
  
  return 0;
}
