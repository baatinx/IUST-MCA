#include <iostream>

using std::cout;
using std::cin;
using std::endl;
using std::string;

class CreateOrDestroy {
public:
  CreateOrDestroy(string ns):name(ns) {
    cout << "creating " << name << endl;
  }

  ~CreateOrDestroy(){
    cout << "destroying " << name << endl;
  }

private:
  string name;
};

CreateOrDestroy globalVar{"GlobalVar"};

void func(){
  cout << "I am inside func()" << endl;
  static CreateOrDestroy staticVar{"StaticVar"};
  CreateOrDestroy localVar{"LocalVar"};
}


int main(){
  cout << "I am in main" << endl;
  cout << "I am calling func()" << endl;
  func();
  cout << "I am calling func() again" << endl;
  func();
  return 0;
}
