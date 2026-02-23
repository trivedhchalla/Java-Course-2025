package practice;

public /*abstract*/ class Practice1 {
	
//	not that much intelligent to catch the zero div error
	public static float div(int a , int b) {
		try {
			System.out.println("hi"+ "");
			return a / b;
		}
		catch (Exception e){
				e.printStackTrace();
				System.out.println("Executed");
				return (int) 0.0f;
		}
	}
	
	public static void main(String[] args) {
		
		Practice1 fp1 = new Practice1();
//		System.out.println("Div: " + div(0,0));
		float a = 4;
		a = (float) 'b';
		System.out.println(fp1.hashCode());
		
//		String s1 = 
		String joined = String.join(" ","A","B","C");
		System.out.println(joined);
	}
	
}
