#include <iostream>

int main(){
  int a;
  int b;

  std::cout << "Enter two numbers to compare" << std::endl;

  // Observe that you can use cascading with stream
  // extraction operator. This is possible because the
  // stream extraction operator returns a reference to
  // the input stream.
  std::cin >> a >> b;

  std::cout << a << " == " << b << " ? " << (a == b) << std::endl;
  std::cout << a << " >  " << b << " ? " << (a >  b) << std::endl;
  std::cout << a << " >= " << b << " ? " << (a >= b) << std::endl;
  std::cout << a << " <  " << b << " ? " << (a <  b) << std::endl;
  std::cout << a << " <= " << b << " ? " << (a <= b) << std::endl;
  std::cout << a << " != " << b << " ? " << (a != b) << std::endl;

  return 0;
}
