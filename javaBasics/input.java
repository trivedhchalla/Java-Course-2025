import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // // input int 
        // System.out.println("Please Enter a ur Lucky nUmver:");
        // int num = sc.nextInt();
        // System.out.println("Lucky NUmver"+num);

        // // Input as a string 
        // System.out.println("Enter Your Name");
        // String name = sc.next();
        // System.out.println("Entered Name is: "+name);
        // // draw back of sc.next() is it only take first word in a string before a space ex :Physics in Physics Wallah 
        // // #Input Enter Your Name :Challa truvedh 
        // // #Output Entered Name is: Challa
        
        // // Complete string as input
        // System.out.println("Complete Name");
        // String naam = sc.nextLine();
        // System.out.println("Complete name is: "+naam);
        
        // // Sum of two int 
        // System.out.println("Enter first num: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter Second num:");
        // int num2 = sc.nextInt();
        // System.out.println("Sum: "+(num1+num2));
        
        // // Simple Interest PRogram
        // System.out.println("ENter the principal amt:");
        // float p = sc.nextFloat();
        // System.out.println("Enter ROI:");
        // float r = sc.nextFloat();
        // System.out.println("Enter time line:");
        // float t = sc.nextFloat();
        // System.out.println("Simple Interest: "+(p*r*t)/100);
        // // reading / taking input of a char
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character is: "+ch);
        sc.close();
    }
}
