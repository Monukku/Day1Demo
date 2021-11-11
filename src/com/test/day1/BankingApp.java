package com.test.day1;

import com.test.day2.Account;
import com.test.day2.NewTransaction;

public class BankingApp {
public static void main(String[] args) {
	
	Account ravi =  new Account(2323234L, 10000);
	ravi.deposit(15000);
	System.out.println(ravi.getBalance());
	ravi.withdrawl(6000);
	System.out.println(ravi.getBalance());
	
   Account raj = new Account(45454545L,1000);
     ravi.transfer(raj, 8000);
     
     System.out.println("Raj's balance"+raj.getBalance());
     System.out.println("Ravi's balance"+ravi.getBalance());
  
	//it is of type NewTransaction
     //does it getBalance
     
     NewTransaction  transa1 =  new Account(343545L,10000);
     transa1.withdrawl(4000);
     
     System.out.println(((Account)transa1).getBalance());
     
     
}
}
