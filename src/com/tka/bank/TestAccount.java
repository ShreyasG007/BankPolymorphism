package com.tka.bank;

public class TestAccount {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(12345, "Shreyas Gijare", 100000);

		savingAccount.displayAccountInfo();
		System.out.println();
		for(int i=1;i<=5;i++) {
			savingAccount.withdraw(1000);
		}
		System.out.println();
		savingAccount.withdraw(1000);
		
		System.out.println();
		CurrentAccount currentAccount = new CurrentAccount(123, "Rajat Kurdukar", 20000, 10000);
		
		currentAccount.withdraw(25000);
		currentAccount.displayAccountInfo();
		System.out.println();
		currentAccount.withdraw(25000);
	}
}
