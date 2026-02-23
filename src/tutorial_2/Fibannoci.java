package tutorial_2;
import java.util.Scanner; 

// Create a class Fibonacci with:
//Method: printSeries(int terms) — prints the first N terms of the Fibonacci series
//Task:
//Get number of terms from user.
//Print the Fibonacci series using a loop.
//Concepts: Class, if-else, condition-based calculation

public class Fibannoci {
	Scanner sc = new Scanner(System.in);
	
	public String printSeries() {
		
		int n = sc.nextInt();
		int prev = 1;
		int lastButPrev = 1;
		int store = 0;
		for(int i = 0; i < n ; i ++) {
			
			if(i ==0) {
				System.out.print(lastButPrev);
			}else if(i == 1) {
//				System.out.print(lastButPrev);
				System.out.print(prev);
			}else {
				store = prev;
				prev = lastButPrev + prev;
				lastButPrev = store;
				if(prev < Math.pow(-2,31) && prev > Math.pow(2, 31)-1) {
					return "Out of bounds";
				}else {
					System.out.print(" "+prev);
				}
			}// else
		}// loop
		return "";
	}// method

	public static void main(String[] args) {
	
		Fibannoci f1 = new Fibannoci();
		
		f1.printSeries();
		
	}// psvm method	
		
		
		
		
		
		
}// class
