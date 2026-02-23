package constructors;

public class A {
	int age;
	public A() {
		System.out.println("Hello I'm constructor of A");
	}
	public A(int age) {
		this.age = age;
		System.out.println("Completed setting of age of A");
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
