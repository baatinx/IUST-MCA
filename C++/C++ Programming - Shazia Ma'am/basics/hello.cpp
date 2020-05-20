#include <iostream>

//
// We have to prefix cout with std using the :: operator
// because cout belongs to the std namespace. 'cout' is
// the standard output stream. '<<' is the stream insertion
// operator and the data is inserted in the direction of
// the operator.
// We are using the familier escape sequence '\n' for newline.
// We can also use 'endl' object from the std namespace.
int main(){
  std::cout << "Hello\nWorld ";
  std::cout << "from C++";
  std::cout << "." << std::endl;
  // (std::cout << ".") << std::endl
  return 0;
}
