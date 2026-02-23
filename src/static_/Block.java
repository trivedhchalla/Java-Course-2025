package static_;
import static java.lang.Math.*;
// always the instant attributes and initial 
public class Block {
	
	static int staticCount;
	int objCounter;
	static {
		staticCount = 100;
		System.out.println("Static Counter is: "+ staticCount);
	}
	{
		objCounter = 10;
		System.out.println("Object Counter is: "+ objCounter);
	}
	public Block() {
		System.out.println("Block constructor Called!!");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Started!!");
		Block obj1 = new Block();
		
		Block obj2 = new Block();
		System.out.println("Main ended!!");
		
		System.out.println(addExact(2,3));
	}

}

