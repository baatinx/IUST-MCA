#include <iostream>
#include <cmath>

using std::cout;
using std::cin;
using std::endl;

int main(){
  double sqrt_of_2 = sqrt(2.0);
  cout << "Square root of 2 is " << sqrt_of_2 << endl;
  cout << "For 2.13, ceil is " << ceil(2.13) << " "
       << "and floor is " << floor(2.13) << endl;

  cout << "For 2.61, ceil is " << ceil(2.61) << " "
       << "and floor is " << floor(2.61)
       << endl;

  cout << "For 60 degrees "
       << "sine = " << sin(60.0) << " "
       << "cosine = " << cos(60.0) << " "
       << "tangent = " << tan(60.0) << endl;

  cout << "Log of 10 to the base e is " << log(10) << " "
       << "and log of 10 to the base " << log10(10) << endl;

  cout << "2 raised to the power of 10 is " << pow(2, 10)
       << endl;
  return 0;
}
