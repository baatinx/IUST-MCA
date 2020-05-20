#include <iostream>

int main(){
  int a{10};
  int b{20};
  int c{30};

  std::cout << a + b * c << std::endl;
  std::cout << (a + b) * c << std::endl;

  return 0;
}
