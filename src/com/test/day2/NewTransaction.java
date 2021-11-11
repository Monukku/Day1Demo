package com.test.day2;

//why are we extending an interface
//create smaller interfaces
//second reason , already impl classes are there for Transaction interface
public interface NewTransaction  extends Transaction{
   double transfer(Account account,double amount);
}
