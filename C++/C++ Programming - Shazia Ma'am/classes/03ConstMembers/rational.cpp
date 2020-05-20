#include "rational.h"
#include <string>
#include <sstream>
#include <exception>

Rational::Rational(int num, int denom)
  :numerator{num}
{
  setDenominator(denom);
}

int Rational::getNumerator() const {
  return numerator;
}

void Rational::setNumerator(int numerator) {
  this->numerator = numerator;
}

int Rational::getDenominator() const {
  return denominator;
}

void Rational::setDenominator(int denominator){
  if(denominator == 0){
    throw std::invalid_argument("Denominator cannot be zero");
  }
  this->denominator = denominator;
}

std::string Rational::toString() const {
  std::stringstream s;
  s << numerator << "/" << denominator;
  return s.str();
}
