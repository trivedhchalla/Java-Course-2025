package overloading;

public class test {
	// static method can be called in sub class or in same class
	public static void main(String[] args) {
		SuperClass sup1 = new SuperClass();
		SubClass sub1 = new SubClass();
		System.out.println(sup1.add(5, 98));
		System.out.println("With inheritance of Sub is a Super " + sub1.add(2,1));
		System.out.println(sub1.add(98,1,2));
	}
}
