package constructors;

public class C extends B{
	int age;
	public C() {
		System.out.println("Hello I'm constructor of C");
	}
	public C(int age) {
		super(age);
		this.age = age;
		System.out.println("Setting Done by C");
		
	}
	public static void main(String[] main) {
		C classCheck = new C(12);
//		System.out.println(classCheck.age);
	}

}
