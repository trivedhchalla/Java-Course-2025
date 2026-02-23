package studentOOP;

public class Student {
	
	private long id ;
	private String name;
	private Dept dept;
	private Prof prof;
	
	// constructor
	public Student(long id,String name,Dept dept,Prof prof) {
		this.id = id ;
		this.name = name;
		this.dept = dept;
		this.prof = prof;
	}
	
	// getters
	public long getid() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDept() {
		return this.dept.getDept();
	}
	
	public String getProf() {
		return this.prof.getName();
	}
	
	// display function
	public void display() {
		System.out.println("Name: "+this.getName());
		System.out.println("Id: "+this.getid());
		System.out.println("HOD: "+this.getProf());
		System.out.println("Department: " + this.getDept());
	}
	
}
	
	
	
	
	
	
	
	
	
	