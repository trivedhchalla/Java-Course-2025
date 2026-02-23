package multiThreading;

import java.util.*;

public class MyRunnable  implements Runnable{
	
	List<String> list = new ArrayList<String>();
	public void run() {
//		System.out.println("Thread is Running");
		list.add("Trivedh");
	}
	
}
