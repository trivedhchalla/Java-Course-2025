package overloading;

public class Calculator {
	// Static vs Non Static
//	public static int add(int a, int b) {
//		return a +b ;
//	}
//	public static int add(int a,int b,int c) {
//		return a + b + c;
//	}
//	public int add(int a, int b) {
//		return a +b ;
//	}
//	public int add(int a,int b,int c) {
//		return a + b + c;
//	}
	// signature
	public int add(int a, int b) {
		System.out.println("Int walas");
		return a + b;
	}
	public int add(byte a, int b) {
		System.out.println("Byte wala");
		return a + b;
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(1,2));
		System.out.println(c1.add(1,2));
	}
	
}
