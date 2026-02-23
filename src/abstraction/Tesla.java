package abstraction;

public class Tesla extends Car implements Flyin{
	public void stop() {
		System.out.println("Stop please??");
	}
	
	public void accelerate() {
		System.out.println("Speed inc...!!");
	}

	public void engine() {
		System.out.println("Engine Start");
	}
	public void fly() {
		System.out.println("Hey i am flying");
	}
	
}
