package tutorial_2;
import java.util.Scanner;
//BankAccount Transaction Simulation
//Concepts: Class, loop (while), conditional (switch), user interaction
//
//Problem:
//Create a BankAccount class with:
//
//Fields: accountNumber, balance
//
//Methods: deposit(), withdraw(), checkBalance()
//
//Task:
//
//
//Show a menu:
//
//1. Deposit
//2. Withdraw
//3. Check Balance
//4. Exit
//Perform actions based on user choice using switch-case.
//
//Repeat using a loop until the user exits.
public class SimulateBank {

	long accNum;
	long balance;
	
	public SimulateBank(long accNum,long balance) {
		
		this.accNum = accNum;
		this.balance = balance;
		
	}
	
	public void deposit(long depositAmt) {
		
		this.balance += depositAmt;
		
	}
	
	public void withdraw(long withdrawAmt) {
		if(this.balance < withdrawAmt) {
			System.out.println("Insuffiecent Balance!!");
		}else {
			this.balance -= withdrawAmt;
			System.out.println("Please take out the cash carefully!!");
		}
	}
	
	public long checkBalance() {
		
		return (this.balance);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your Account Number:");
		long accNum = sc.nextLong();
		long balance = 0;
		SimulateBank accHolder1 = new SimulateBank(accNum,balance);
		
		
		outter:while(true) {
			System.out.println("Menu:\n1)Deposit\n2)Withdraw\n3)Check Balance\n4)Exit");
			System.out.println("Please select the one Transaction from above");
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Please Enter the deposit amount:");
				long depAmt = sc.nextLong();
				accHolder1.deposit(depAmt);
				break;
			case 2:
				System.out.println("Please Enter the withdrawal amount:");
				long withAmt = sc.nextLong();
				accHolder1.withdraw(withAmt);
				break;
			case 3:
				System.out.println("The balance is:" + accHolder1.checkBalance());
				break;
			case 4:
				System.out.println("Thank You for using BankOfSitare");
				break outter;
			default:
				System.out.println("Please select valid Transaction!!");
				break ;
			}
		} // loop
		sc.close();
	}// psvm
	
}//class










