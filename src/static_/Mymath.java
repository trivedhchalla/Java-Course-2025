package static_;
import java.util.Scanner;

public class Mymath {
//	when there is no relation b/w function and attributes of class 
//	static --> class level 
//	non-static --> object level
//	the jvm class loader loads all the static methods or attributes in the first step 
//	make constructor as private if u want to block object creation
//	in static we can only use other static attributes or methods 
//	since the sc became instant variable so it must be static in order to use in a  static method
	static Scanner sc = new Scanner(System.in);
	public static int add(int a,int b) {
		return (a+b < Integer.MAX_VALUE && a+b > Integer.MIN_VALUE) ? a + b : 0;
	}
	
	public static int subtract(int a,int b) {
		return (a - b < Integer.MAX_VALUE && a - b > Integer.MIN_VALUE) ? a - b : 0;
	}
	
	public static int multiply(int a , int b) {
		return (a * b < Integer.MAX_VALUE && a * b > Integer.MIN_VALUE) ? a * b : 0;
	}
	
	public static int divide(int a, int b) {
		if(b == 0) {
			System.out.println("Division Error");
		}
		return (a / b < Integer.MAX_VALUE && a / b > Integer.MIN_VALUE) ? a / b : 0;
	}
	
	public static void main(String args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum:"+add(num1,num2));
		System.out.println("Subtract:"+subtract(num1,num2));
		System.out.println("Multiplication:"+add(num1,num2));
		System.out.println("Divide:"+add(num1,num2));
		sc.close();
	}
	
}
