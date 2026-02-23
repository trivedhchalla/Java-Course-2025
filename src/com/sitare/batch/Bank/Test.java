package com.sitare.batch.Bank;

public class Test {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(124324354,10000,12);
		SavingAcc sav1 = new SavingAcc(12432,10000,2,500);
		acc1.deposit(10000);
		System.out.println(acc1.checkBalance());
		sav1.deposit(10000);
		System.out.println(sav1.checkBalance());
		System.out.println(sav1.withdraw(10000));
		System.out.println(sav1.checkBalance());
		
		
	}
	
}
