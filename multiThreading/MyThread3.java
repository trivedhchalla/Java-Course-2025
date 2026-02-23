package multiThreading;

import java.sql.SQLOutput;
import java.sql.Time;

public class MyThread3 extends Thread {
    // Case - 1
//    public void run(){
//        for(int i = 0; i  < 10; i++){
//            System.out.println("Child-Thread");
//            try {
//                Thread.sleep(2000);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }

    // Case - 2
//        static Thread mt ;
//        public void run(){
//            try{
//                mt.join();
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//            for(int i = 0; i < 10; i++){
//                System.out.println("Child-Thread");
//            }
    // Case - 3
//    static Thread mt;
//
//    public void run() {
//        try {
//            mt.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Child-Thread");
//        }
//  }

//     public void run(){
//            try{
//                for(int i = 0; i < 10; i ++){
//                    System.out.println("I am a lazy Thread");
//                    Thread.sleep(2000);
//                }
//            }catch(InterruptedException e){
//                System.out.println("I am interruped");
//            }
//        }
    public void run(){
        for(int i = 0; i < 10000; i ++) {
            System.out.println("I am a lazy Thread - " + i);
        }
        System.out.println("I am entering into sleep mode");
        // if thread dies before sleep
//        long in = System.currentTimeMillis();
//        try{
//            Thread.sleep(10000);
//            // not even reaching this statement
//            long out = System.currentTimeMillis();
//            System.out.println(out - in);
//        }catch(InterruptedException e){
//            System.out.println("I am interruped");
//        }
    }
}
