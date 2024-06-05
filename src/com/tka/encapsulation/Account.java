package com.tka.encapsulation;

public class Account {
	private int accNO;
	private double balance;
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		if(amt>100000) {
			System.out.println("You can not deposit more than 100000 rs");
		}
		else if(amt<=0) {
			System.out.println("Please enter a valid amount");
		}
		else {
			this.balance += amt;
			System.out.println("Deposit SuccessFull !!! ");
			System.out.println("Updated Balance : "+this.balance);
		}
	}
	
	public void withdraw(double amt) {
		if(amt>this.balance) {
			System.out.println("You have low balance your balance is  "+this.balance+" and your withdraw amount "+amt);
		}
		else if (amt<=0) {
			System.out.println("Please Enter Valid amount");
		}
		else
		{
			this.balance-=amt;
			System.out.println("Withdraw SuccessFull !!! ");
			System.out.println("Updated Balance : "+this.balance);
			
		}
	}
}
