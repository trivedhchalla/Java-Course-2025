package studentOOP;
import java.util.Scanner;

public class Switch {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int dayNum = sc.nextInt();
		sc.close();
		
//		switch(dayNum) {
//		case 1:
//			System.out.println("Sunday");
//			break;
//		case 2:
//			System.out.println("Monday");
//			break;
//		case 3:
//			System.out.println("Tuesday");
//			break;
//		case 4:
//			System.out.println("Wednesday");
//			break;
//		case 5:
//			System.out.println("Thursday");
//			break;
//		case 6:
//			System.out.println("Friday");
//			break;
//		case 7:
//			System.out.println("Satday");
//			break;
//			
//		}
		int ans = 0;
		while(dayNum != 0) {
			ans = ans * 10;
			int rem = dayNum % 10;
			ans += rem;
			dayNum /= 10;
		}
		System.out.println(ans);

	}
}
