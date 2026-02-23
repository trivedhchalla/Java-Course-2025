package overloading;

public class SubClass extends SuperClass {
	
	public int add(int a, int c,int d) {
		System.out.print("Sub Class Addition ");
		return a + c + d;
	}
	
//	public static void main(String[] args) {
//		SuperClass sup1 = new SuperClass();
//		SubClass sub1 = new SubClass();
//		System.out.println(add(5, 98));
//		System.out.println("With inheritance of Sub is a Super");
//		
//		System.out.println(add(98,1,2));
//	}
	
}
