package exceptionHandlingGodLevel;

import java.rmi.server.ExportException;

public class ExceptionClass7 extends RuntimeException{
    ExceptionClass7(String s){
        super(s);
    }
    public static void main(String[] args){
        throw new ExceptionClass7("Hello && Bye");
    }
}
