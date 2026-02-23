package exceptionHandlingGodLevel;

public class exceptionClass2 {
//	Below when 10 / 0 in doStuff
//	Hello
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at javaByDurga/exceptionHandlingGodLevel.exceptionClass2.doStuff(exceptionClass2.java:11)
//		at javaByDurga/exceptionHandlingGodLevel.exceptionClass2.main(exceptionClass2.java:6)

	public static void doStuff() {
		doMoreStuff();
		System.out.println("HI");
	}
	
//	Below when 10 / 0 in doMoreStuff
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at javaByDurga/exceptionHandlingGodLevel.exceptionClass2.doMoreStuff(exceptionClass2.java:14)
//	at javaByDurga/exceptionHandlingGodLevel.exceptionClass2.doStuff(exceptionClass2.java:10)
//	at javaByDurga/exceptionHandlingGodLevel.exceptionClass2.main(exceptionClass2.java:6)
	public static void doMoreStuff() {
		System.out.println("Hello");
	}

//	Below when main have 10 / 0
//	Hello
//	HI
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at javaByDurga/exceptionHandlingGodLevel.exceptionClass2.main(exceptionClass2.java:7)
	public static void main(String[] args) {
		doStuff();
		System.out.println(10/0);
	}

}
