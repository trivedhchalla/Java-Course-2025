package multiThreading;

public class Class2 extends Thread {

    public void run(){
        System.out.println("Hello by child thread");
    }
    // for overloading of run()
//    public void run(){
//        //		for overloaded concept
//        System.out.println("NO arguments");
//    }
//
//    public void run(int i){
//        System.out.println("Single Argument");
//    }
}
