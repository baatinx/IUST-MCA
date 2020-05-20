#include <iostream>

int main(){
  // We are using the new C++11 way of initializing
  // variables known as list initialization
  int a{0};
  int b{0};
  int sum{0};

  // We are again using stream insertion operator
  // to insert string
  std::cout << "Enter a ? ";

  // We are using stream extraction operator to take
  // data from the standard input stream(keyword) 'cin'
  // It waits for the input and when the user inputs
  // the characters using a keyboard and presses return
  // the character sequence is converted into an integer
  // (data type of a) and assigns the value to a
  std::cin >> a;
  
  std::cout << "Enter b ? ";
  std::cin >> b;

  sum = a + b;

  // Here we are cascading the stream insertion
  // operator. As the operator returns a reference
  // to the stream, we can again use it for insertion
  // 'endl' is known as a stream manipulator and it
  // inserts a newline into the output and the flushes
  // the output buffer.
  std::cout << "The sum is : " << sum << std::endl;

  return 0;
}
