package multiThreading;

public class ThreadSleepDemo {

    public static void main(String[] args){
        // Case - 4
//        for(int i = 0; i < 10 ; i ++){
//            System.out.println("Slide " + i);
//            try{
//                Thread.sleep(5000);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
        MyThread3 t1 = new MyThread3();
        t1.start();
        t1.interrupt();
        System.out.println("End of Main");

    }
}
