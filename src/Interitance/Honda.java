package Interitance;

public class Honda extends Car {
	
	public Honda(int noofWheels) {
		super(noofWheels);
	}
	
	boolean alloyWheels = false;
	
	public void setAlloyWheels() {
		if(noofWheels > 0 ) {
			System.out.println("Alloys On Wheels Hurrey🥳🥳🥳");
			this.alloyWheels = true;
		}
		else {
			System.out.println("No wheels to replace with Alloy!!");
		}
	}
	
}
