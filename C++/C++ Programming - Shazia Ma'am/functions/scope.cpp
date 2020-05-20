#include <iostream>
#include "scope_support.h"

using namespace std;

// Global variable.
int x;

int main(){
  cout << "Globals are initialized " << x << endl;
  {
    int x{100};
    cout << "You can shadow a global by a local " << x
	 << endl;
    {
      int x{200};
      cout << "You can shadow a local with another nested local "
	   << x << endl;
      cout << "I can still access global variables using unary scope resolution as "
	   << ::x << endl;
    }
    cout << "You get your local back " << x << endl;
  }
  cout << "You get your global back " << x << endl;

  cout << "You can also access globals from other file " << outside
       << endl;

  //You can't do this!
  //cout << inside << endl;
  return 0;
}
