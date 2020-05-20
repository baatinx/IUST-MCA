#include <string>

class Rational {
 public:
  Rational(int num, int denom = 1);

  int getNumerator() const;

  void setNumerator(int num);
  
  int getDenominator() const;

  void setDenominator(int num);
  
  std::string toString() const;
  
 private:
  int numerator;
  int denominator;
};

