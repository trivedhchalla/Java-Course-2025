package accessModifier;

public class Dog extends Animal{
	
	@Override
	public String makeSound() {
//		return "Dog Sound!!";
		System.out.println("Dog");
		return super.makeSound();
}
	
}
