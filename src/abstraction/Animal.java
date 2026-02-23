package abstraction;

interface Animal {
	public void eat();

	public void travel();
	
	default void m1() {
		System.out.println(" Private m3 is called:");
		this.m2();
		System.out.println(" Hello by M1 defualt");
	}
	
	private void m2() {
		System.out.println(" Hello by M2 private");
	}
	
	static void m3() {
		System.out.println(" Hello by M3 static");
	}
	
	public static void main(String[] args) {
		Mammal mam = new Mammal();
		mam.eat();
		mam.travel();
		System.out.println();
		System.out.println("Print from defualt: ");
		mam.m1();
		System.out.println("\nPrint from static");
		m3();
		
		
		
	}
}
