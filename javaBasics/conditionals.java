import java.util.Scanner;
public class conditionals{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        byte num = sc.nextByte();

        // // Conditionals if-elif-else
        // if(num < 18){
        //     System.out.println("CHild");
        // }
        // else if(num > 18 && num < 45){
        //     System.out.println("Middle Age");
        // }
        // else{
        //     System.out.println("Old Age");
        // }
        // sc.close();
        // // ternary operator 
        // System.out.println((num % 2 == 0 ? "Even" : "Odd"));
        
        // //switch statement 
        switch(num){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please entry valid num bw 0 to 6");
        }
        sc.close();
    }
}
