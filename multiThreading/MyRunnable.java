package multiThreading;

public class MyRunnable implements Runnable{
    public void run(){
//        for(int i = 0; i < 10; i++){
//            System.out.println("Child Thread");
//        }

        //  get thread name
        System.out.println("This is executed by: " + Thread.currentThread().getName());
    }
}
