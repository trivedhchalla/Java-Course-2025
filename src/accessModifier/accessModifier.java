package accessModifier;

public class accessModifier {
	
	// public : in any case we can use every where 
	// private : in same class accessible and rest any where not 
	// protected : in subclass and same package/class any where and non sub class not accessible 
	// default : in same package accessible and in different package non accessible
	
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		Dog snoopy = new Dog();
//		System.out.println(ani1.makeSound());
		System.out.println(snoopy.makeSound());
	}
	
	
}