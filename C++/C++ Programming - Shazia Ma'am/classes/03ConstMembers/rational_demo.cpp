#include <iostream>
#include "rational.h"

using std::cout;
using std::cin;
using std::endl;

void divideBy2(Rational &r){
  r.setDenominator(r.getDenominator() * 2);
}

float floatValue(const Rational &r){
  return static_cast<float>(r.getNumerator()) / static_cast<float>(r.getDenominator());
}

int main(){
  Rational p{9};
  Rational q{10, 2};
  Rational r(15, 3);

  cout << "p = " << p.toString() << endl;
  cout << "q = " << q.toString() << endl;
  cout << "r = " << r.toString() << endl;

  divideBy2(p);

  cout << "p/2 = " << floatValue(p) << endl;
  return 0;
}
