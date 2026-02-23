package tutorial_2;
import java.util.Scanner;

//Create a class ElectricityBill with:
//Fields: customerName, unitsConsumed
//Method: calculateBill():
//₹5/unit for first 100 units
//₹7/unit for next 100 units
//₹10/unit above 200
//Task:
//Accept customer name and units consumed.
//Display calculated bill

public class ElectricityBoardSitare {
	
	String cusName;
	float unitsConsumed;
	public ElectricityBoardSitare(String cusName,float unitsConsumed) {
		
		this.cusName = cusName;
		this.unitsConsumed = unitsConsumed;
		
	}
	
	public float calculateBill() {
		float totalBill ;
		if(this.unitsConsumed <= 100) {
			return (this.unitsConsumed * 5);
		}
		else if(this.unitsConsumed < 200 && this.unitsConsumed > 100){
			this.unitsConsumed -= 100;
			totalBill = 100 * 5 + this.unitsConsumed * 7;
		}
		else {
			this.unitsConsumed -= 200;
			totalBill = 100 * 5 + 100 * 7 + this.unitsConsumed * 10;
		}
		return totalBill;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String cusName = sc.next();
		System.out.println("Please enter numbers units consumed:");
		float unitsConsumed = sc.nextFloat();
		ElectricityBoardSitare cus1 = new ElectricityBoardSitare(cusName, unitsConsumed);
		System.out.println("Total Electricity Bill is:" + cus1.calculateBill());
		sc.close();
	}	
	
	
}
