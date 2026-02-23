public class operators {
    public static void main(String[] args) {
        // arithmetic operators 
        byte a = 10;
        byte b = 23;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // relational 
        byte c = 23;
        byte d = 23;
        byte e =33;
        System.out.println(c == d);
        System.out.println(c >= d);
        System.out.println(c <= d);
        System.out.println(c > e);
        System.out.println(d < e);
        
        // logical operators
        System.out.println((c == d) && (c >= d));//true
        System.out.println(!(c >= d));//false
        System.out.println((c != d) || (c >= d));//true

        // assignment operators
        byte f = 23 ;
        byte g = 23;
        System.out.println(f += g);
        System.out.println(f -= g);
        System.out.println(f *= g);
        System.out.println(f /= g);
        System.out.println(f %= g);

        // post pre increment or decrement
        byte h = 34;
        System.out.println(++h);// 35
        System.out.println(h++);// 35 is printed and then h =36 made 
        System.out.println(h);//36
        
        // bitwise operators
        byte j = 12;
        byte k = 11;
        System.out.println(k & j);
        System.out.println(~ j);// bitwise complement
        System.out.println(k >> j);
        System.out.println(k << j);
        System.out.println(k | j);
        System.out.println("Bitwise >>> shift: ");// this donot consider the 
        System.out.println(k>>>1);
        
        // good ques
        System.out.println(4 + 2 + "pqr");
        System.out.println("pqr" + 4 + 2);
        boolean p = true;
        boolean q = false;
        boolean r =false;
        System.out.println(q == r == p);
    }
}
