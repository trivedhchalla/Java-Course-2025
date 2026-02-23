package constructors;

public class B extends A {
	static String scl = "SU";
	int age;
	public B() {
		System.out.println("Hello, I'm constructor of B");
	}
	public B(int age) {
		super(age);
		this.age = age;
		System.out.println("Setting age by B");
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
	
}
