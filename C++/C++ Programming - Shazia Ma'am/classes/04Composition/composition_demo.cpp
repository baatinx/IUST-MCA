#include "account.h"
#include <iostream>
#include <string>

using std::cout;
using std::endl;
using std::string;

int main(){
  Customer customer{"Ahmad"};
  Account account;
  account.setBalance(100);
  
  customer.setAccount(account);
  account.setBalance(200);

  cout << "Account balance is "
       << customer.getAccount().getBalance()
       << endl;

  return 0;
}
