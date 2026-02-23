package multiThreading;

public class ThreadPriorities4 {
    public static void main(String[] args){
        // default thread priorities
//        System.out.println(Thread.MIN_PRIORITY);// 1
//        System.out.println(Thread.MAX_PRIORITY);// 5
//        System.out.println(Thread.NORM_PRIORITY);// 10

        // getting and setting priority of a thread
        // we cannot pass the name to extended thread class direclty if runnable then ok and setname is also ok
//        MyThread2 t1 = new MyThread2();
//        t1.setName("Trivedhs Thread");
//        System.out.println("Thread name curr thred: " + Thread.currentThread().getName());
//        System.out.println("Thread name other thread: " + t1.getName());

        // getting and setting priority"
//        System.out.println("Main Default priority: " + Thread.currentThread().getPriority());
//       // Thread.currentThread().setPriority(22);// IllegalArgument Exception
//        Thread.currentThread().setPriority(8);
//        System.out.println("Main: " + Thread.currentThread().getPriority());
//        MyThread2  t1 = new MyThread2();
//        System.out.println("T1 :" + t1.getPriority());

        MyThread2  t1 = new MyThread2();
        t1.setPriority(10);
        t1.start();
        for(int i = 0; i < 10; i++){
            System.out.println("Main Thread");
        }
    }
}
