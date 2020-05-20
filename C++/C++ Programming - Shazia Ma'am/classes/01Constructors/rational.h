#include <string>

class Rational {
 public:
  Rational(int num, int denom = 1);

  int getNumerator() const;
  int getDenominator() const;
  std::string toString() const;
  
 private:
  int numerator;
  int denominator;
};

