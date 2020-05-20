#include <string>

class Account {
 public:
  
  Account();
  
  double getBalance() const;

  void setBalance(double bal);

 private:
  double balance;
};

class Customer {
 public:

  Customer(const std::string &name);

  ~Customer();

  const std::string & getName() const;

  void setAccount(const Account & account);

  const Account& getAccount() const;

 private:
  std::string name;
  Account account;
};

