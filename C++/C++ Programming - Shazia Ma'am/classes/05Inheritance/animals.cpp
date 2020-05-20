#include <iostream>
#include "animals.h"

using std::cout;
using std::cin;
using std::endl;

Animal::Animal(const std::string &animalName): name{animalName}{
}

void Animal::eat(Eatable* eatable){
  cout << "I am eating " << eatable->getName()
       << " and got " << eatable->getCalories()
       << endl;
}

void Animal::breathe(){
  cout << name << " is breathing" << endl;
}

const std::string& Animal::getName() const {
  return name;
}

Cat::Cat(const std::string &animalName):Animal(animalName){
}

void Cat::speak(){
  cout << "meaw meaw!" << endl;
}

Hen::Hen(const std::string &animalName, int cals):Animal{animalName},calories(cals){
}

void Hen::speak(){
  cout << "cluck cluck" << endl;
}

int Hen::getCalories(){
  return calories;
}

const std::string& Hen::getName() const {
  return Animal::getName();
}

void Hen::breathe() {
  cout << getName() << " is breathing faster!" << endl;
}








