#include <iostream>
#include "rational.h"

using std::cout;
using std::cin;
using std::endl;

int main(){
  Rational p{10};
  Rational q{10, 2};
  Rational r(15, 3);

  cout << "p = " << p.toString() << endl;
  cout << "q = " << q.toString() << endl;
  cout << "r = " << r.toString() << endl;

  return 0;
}
