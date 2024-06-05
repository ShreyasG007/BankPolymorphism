package com.tka.bank;

public class Account {
	public int accountNo;
	public String accounHolder;
	public int balance;
	public Account(int accountNo, String accounHolder, int balance) {
		super();
		this.accountNo = accountNo;
		this.accounHolder = accounHolder;
		this.balance = balance;
	}
	public void deposit(double amt) {
		System.out.println("Deposit Successful!!!");
		
	}
	
	public void withdraw(double amt) {
		System.out.println("Withdraw Successful!!!!");
	}
	
	public void displayAccountInfo() {
		System.out.println("Account info!!!!");
	}
}
