package com.tka.bank;

public class SavingAccount extends Account {
	public static int withdrawCounter = 0;

	public SavingAccount(int accountNo, String accounHolder, int balance) {
		super(accountNo, accounHolder, balance);
	}

	@Override
	public void deposit(double amt) {
		if (amt > 100000) {
			System.out.println("You can not deposit more than 100000 rs");
		} else if (amt <= 0) {
			System.out.println("Please enter a valid amount");
		} else {
			this.balance += amt;
			System.out.println("Deposit SuccessFull !!! ");
			System.out.println("Updated Balance : " + this.balance);
		}
	}

	@Override
	public void withdraw(double amt) {
		if (withdrawCounter < 5) {
			if (amt > this.balance) {
				System.out.println(
						"You have low balance your balance is  " + this.balance + " and your withdraw amount " + amt);
			} else if (amt <= 0) {
				System.out.println("Please Enter Valid amount");
			} else {
				this.balance -= amt;
				System.out.println("Withdraw SuccessFull !!! ");
				System.out.println("Updated Balance : " + this.balance);
				withdrawCounter += 1;
				System.out.println("withdraw count : " + withdrawCounter);

			}

		} else {
			System.out.println("Withdraw Limit exceed!!!!!!");
			System.out.println("Only 10 withdraw Allowed in month");
		}
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Saving Account Information");
		System.out.println("Account No : " + accountNo);
		System.out.println("Account Holder : " + accounHolder);
		System.out.println("Balance : " + balance);
	}

}
