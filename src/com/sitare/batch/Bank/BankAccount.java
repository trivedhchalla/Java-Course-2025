package com.sitare.batch.Bank;

public class BankAccount {
	
	long bankAcc;
	int balance;
	float interestRate;
	
	public BankAccount(long bankAcc,int balance,float interestRate){
		
		this.bankAcc = bankAcc;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void deposit(int amt) {
		
		this.balance += amt;
	}
//	
//	public String withdraw(int amt) {
//		if(amt > this.balance) {
//			return "Insufficient Balacne!!";
//		}else {
//			this.balance -= amt;
//			return "Please Count Notes!!";
//		}
//	}
	public int checkBalance() {
		System.out.print("Balance: ");
		return this.balance;
	}
	
}