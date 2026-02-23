package com.sitare.batch.Bank;

public class SavingAcc extends BankAccount {

	int minBalance;
	public SavingAcc(int bankAcc,int balance,float interestRate,int minBalance) {
		// explicitly calling constructor
		super(bankAcc,balance,interestRate);
		this.minBalance = minBalance;
	}
	
	public String withdraw(int amt) {
		if((this.balance - amt) < this.minBalance ) {
			return "Minimum Balance is not Satisfies";
		}else {
			this.balance -= amt;
			return "Please Count notes!!";
		}
	}
	
	
}
