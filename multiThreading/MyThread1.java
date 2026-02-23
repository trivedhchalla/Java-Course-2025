package multiThreading;	
	
public class MyThread1 extends Thread{
		
	public void run() {
		// below is called as work / job of thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
