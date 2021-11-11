package com.test.day2;

public class Account implements Transaction,NewTransaction{

	private Long accountId;
	private double balance;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(Long accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + "]";
	}
	@Override
	public double deposit(double amount) {
		return this.balance+=amount;
	}
	@Override
	public double withdrawl(double amount) {
		if (amount< this.balance) {
			
			return this.balance-=amount;
		}
		else
			return this.balance;
		
	}
	@Override
	public double transfer(Account account, double amount) {
		this.withdrawl(amount);
		account.deposit(amount);
		return this.balance;
	}
	
	
}
