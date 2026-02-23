package multiThreading;

public class Demo2 {
    public static void main() {
        Class2 t = new Class2();

//        /*Overloading of run() method*/
//        t.start();// the no argument one is executed
//        t.run(6);// the argument one is executed

//      if donot override run() mehtod
//        t.start();// empty execution

        // illegalThreadStateException
        t.start();
        t.start();
    }
}
