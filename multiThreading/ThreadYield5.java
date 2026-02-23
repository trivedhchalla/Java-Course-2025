package multiThreading;

public class ThreadYield5 {
    public static void main(String[] args){
        Thread5 t1 = new Thread5();
        t1.start();
        for(int i = 0; i < 10; i++){
            System.out.println("main-thread");
        }
    }
}
