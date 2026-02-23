package collectinsExecution;
import java.util.*;

public class collections1 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Syam");
		names.add("Trivedh");
		names.add("Virat Kohli");
		System.out.println(names);
		for(String name : names) {
			System.out.println(name);
		}
		
		Set<Integer> set = new HashSet<Integer>() ;
		set.add(2);
		set.add(45);
		set.add(18);
		System.out.println(set);
		collections1 c1 = new collections1();
		System.out.println(c1);
		
		Map m = new HashMap<Integer,String>();
		m.put("trivedh",10);
		m.put(2,"kohli");
		m.put(3,"rohot");
		System.out.println(m);
		
		
		
	}
	
	
}
