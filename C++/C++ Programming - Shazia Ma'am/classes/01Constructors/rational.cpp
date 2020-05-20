#include "rational.h"
#include <string>
#include <sstream>
#include <exception>

Rational::Rational(int num, int denom)
  :numerator{num}, denominator{denom}
{
  if(denominator == 0){
    throw std::invalid_argument("denominator cannot be zero");
  }
}

int Rational::getNumerator() const {
  return numerator;
}

int Rational::getDenominator() const {
  return denominator;
}

std::string Rational::toString() const {
  std::stringstream s;
  s << numerator << "/" << denominator;
  return s.str();
}
