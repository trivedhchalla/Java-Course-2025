package exceptionHandlingGodLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exceptionClass9 {
    public static void main(String[] args){
        /*Before Java 1.6*/
//        BufferedReader br = null;
//        try{
//            br = new BufferedReader(new FileReader("abc.txt"));
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//        finally{
//            if(br != null){
//                try {
//                    br.close();
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            }
//        }
        /*Before Java 1.7*/
//        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
//            System.out.println("Done");
//        }catch(IOException e) {
//            e.printStackTrace();
//        }

//        AutoClosable resource Compile time error
//        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt")); FileWriter fw = new FileWriter("abc.txt")){
//            System.out.println("Connecting....");
//            br = new FileReader("abc.txt");
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        

    }
}
