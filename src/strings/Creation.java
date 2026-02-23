package strings;

public class Creation {

	public static void main(String[] args) {

//		String s1 = "String1";
//		String s2 = new String("abc");
//		char[] arr = {'a','b','c'};
//		String s3 = new String(arr);
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		String s5 = "abc";
//		String s4 = "abc";
////		
//		System.out.println(s4 == s3);
////		since this is stored in string pool this works as python memory 
////		that table kinds storing 
//		System.out.println(s5 == s4);
//		System.out.println(s3 == s2);
//		
//		Sitare is printed immutable 
		String s = "Sitare";
//		s.concat("Srmu");
//		System.out.println(s);

// security purpose since we want to create a new obj so obj creation is 
// is visible 
//		storgae draw back 
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.isEmpty());
//		null pointer exception becoz we always take length before storing 
//		String s2 = null;
//		System.out.println(s2.isEmpty());

		String s1 = " Java  is              ";
		String s3 = " java ";

		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareTo(s3));// ascii values compare
//		sum ascii s1 - sum ascii s2
		System.out.println(s3.compareTo(s1));

// method vs api: 
//		for developer its method and user api
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());// remove spaces at start and end
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith(" "));// since spaces at start
		System.out.println(s1.endsWith(" "));// since spaces at end
		System.out.println(s1.contains("J"));
		System.out.println(s1.repeat(2));
		String fruits = "apple.banaa.pineapple";
		
		String[] arr = fruits.split("\\.");
		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println();
		System.out.println(String.join(".", "apple", ".", "banana", "."));

//		String / String Builder / String Buffer
//	Immutable, thread safe/mutable,not thread safe/mutable,thread safe
		
		
		
	}

}
