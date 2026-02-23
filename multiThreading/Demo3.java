package multiThreading;

public class Demo3 {
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();

//        Thread t1 = new Thread(r);
//        t1.start();
//        for(int i = 0; i < 10; i++){
//            System.out.println("Main thread");
//        }


        Thread t2 = new Thread(r);

//        System.out.println(Thread.currentThread().getName());
//        t2.start();
//        System.out.println(Thread.currentThread().getName());
//        t2.setName("Trivedh");
//        System.out.println(t2.getName());

        t2.start();
        System.out.println("This is executed by: " + Thread.currentThread().getName());

    }
}
