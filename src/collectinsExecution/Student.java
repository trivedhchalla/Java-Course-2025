package collectinsExecution;
import java.util.*;

public class Student implements Comparable<Student> {
	private String name;
	private Integer age;
	private double rollno;
	
	public Student(String name,Integer age,double rollno) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	
	public double getRollNo() {
//		System.out.println(this.rollno);
		return this.rollno;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Python",18,34);
		Student s2 = new Student("Kohli",36,82);
		Student s3 = new Student("Java",23,23);
		
		List<Student> arr = new ArrayList<>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		Collections.sort(arr,new RollNoComparator());
		for(Student s:arr) {
			System.out.println(s.name);
		}
	}

}
