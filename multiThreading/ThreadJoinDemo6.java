package multiThreading;

public class ThreadJoinDemo6 {
    public static void main(String[] args) throws InterruptedException{

//        // Case - 1
//        MyThread3 t1 = new MyThread3();
//        t1.start();
////        t1.join();
//        t1.join(10000);// this prints 5child then 10 parent and then 5 child
//        for(int i = 0; i < 10; i++){
//            System.out.println("Parent-Thread");

            // Case - 2
//        MyThread3.mt = Thread.currentThread();
//        MyThread3 t1 = new MyThread3();
//        t1.start();
//        for(int i = 0; i < 10; i ++){
//            System.out.println("Main-Thread");
//            try{
//                Thread.sleep(2000);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
            // Case - 3 Something like DeadLock
//        MyThread3.mt = Thread.currentThread();
//        MyThread3 t1 = new MyThread3();
//        t1.start();
//        t1.join();
//        for(int i = 0; i < 10; i ++){
//            System.out.println("Main-Thread");
//            try{
//                Thread.sleep(2000);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }

            // Case - 4
//        Thread.currentThread().join();

        //

    }
}
