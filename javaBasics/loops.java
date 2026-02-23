import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // // while
        // byte n = sc.nextByte();
        // byte  i = 1;
        // while( i < n){
        //     System.out.println(i);
        //     i *= 2;
        // }
        // byte j = sc.nextByte();
        // // for loop
        // for (;j > 0 ;j /= 2){
        //     System.out.println(j);
        // }

        // // do-while loop
        // byte num2 = sc.nextByte();
        // do{
        //     System.out.println(num2);
        //     num2 ++;
        // }
        // while(num2 < num2);

        // // break and continue with label
        // myloop: for(byte k = 0; k < 10 ; k ++){
        //     if(k == 3){
        //         continue myloop;
        //     }
        //     System.out.println(k);
        // }

        // // hallow rectangle
        // int num3 = sc.nextInt();
        // int num4 = sc.nextInt();
        // outter:for(int m = 1; m <= num3; m++){
        //             inner:for(int o = 1; o <= num4; o++){
        //                 if(m == 1 || m == num3 || o == 1 || o == num4){
        //                 System.out.print("*");
        //                 }
        //                 else{
        //                     System.out.print(" ");
        //                 }
        //             }
        //             System.out.println();
        // }

        int num5 = sc.nextInt();
        for(int ab = 1; ab <= num5; ab ++){
            for (int abc = ab; abc <= num5;abc ++){
                System.out.print(abc);
            }
            int row = 1;
            while(true){
                System.out.print(row);
                row ++;
                if(row > ab) break;
            }
            System.out.println();
        }
        sc.close();

    }
}
