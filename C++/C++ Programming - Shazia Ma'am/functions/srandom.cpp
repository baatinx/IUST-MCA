#include <iostream>
#include <iomanip>
#include <cstdlib>

using std::cout;
using std::cin;
using std::endl;

int main(){
  int times;
  int seed;
  
  cout << "How many times should I roll a dice ? ";
  cin >> times;

  cout << "What is the seed ? ";
  cin >> seed;

  srand(seed);
  for(int i{1}; i <= times; i++){
    cout << std::setw(5) << (1 + rand() % 6);
    if(i > 0 && i % 4 == 0){
      cout << endl;
    }
  }

  cout << endl;

  return 0;
}
