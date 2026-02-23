package multiThreading;

public class Test {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		t.start();
		t2.start();
	}
	
}
                                                                        