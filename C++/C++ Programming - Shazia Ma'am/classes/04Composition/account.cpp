#include "account.h"
#include <string>

Account::Account(){
}

double Account::getBalance() const {
  return balance;
}

void Account::setBalance(double bal){
  balance = bal;
}

Customer::Customer(const std::string &name){
  this->name = name;
}

Customer::~Customer(){
  //Nothing to do
}

const std::string& Customer::getName() const {
  return name;
}

void Customer::setAccount(const Account &account){
  this->account = account;
}

const Account& Customer::getAccount() const {
  return account;
}


