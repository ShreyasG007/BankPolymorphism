package com.tka.encapsulation;


public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccNO(12345);
		account.setBalance(20000);
		
		System.out.println("Account No : "+account.getAccNO());
		System.out.println("Account Balance : "+account.getBalance());
		
		System.out.println();
		System.out.println("Deposit Process");
		
		account.deposit(1000000);
		account.deposit(-20);
		account.deposit(25000);
		
		System.out.println();
		System.out.println("Withdraw process");
		
		account.withdraw(50000);
		account.withdraw(0);
		account.withdraw(20000);
		
		
	}
}
