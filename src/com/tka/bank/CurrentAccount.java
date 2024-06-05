package com.tka.bank;

public class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(int accountNo, String accounHolder, int balance, double overdraftLimit) {
		super(accountNo, accounHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposit(double amt) {
		if (amt > 100000) {
			System.out.println("You can not deposit more than 100000 rs");
		} else if (amt <= 0) {
			System.out.println("Please enter a valid amount");
		} else {
			this.balance += amt;
			System.out.println("Deposit Successful !!! ");
			System.out.println("Updated Balance : " + this.balance);
		}
	}

	@Override
	public void withdraw(double amt) {
		if (amt <= 0) {
			System.out.println("Please enter a valid amount");
		} else if (this.balance - amt < -overdraftLimit) {
			System.out.println("Withdrawal amount exceeds overdraft limit!");
			System.out.println("Withdraw limit : " + -overdraftLimit);
		} else {
			this.balance -= amt;
			System.out.println("Withdraw Successful !!! ");
			System.out.println("Updated Balance : " + this.balance);
		}
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Current Account Information");
		System.out.println("Account No : " + accountNo);
		System.out.println("Account Holder : " + accounHolder);
		System.out.println("Balance : " + balance);
		System.out.println("Overdraft Limit: " + -overdraftLimit);
	}

}