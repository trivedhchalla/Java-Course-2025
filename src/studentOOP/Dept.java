package studentOOP;

public class Dept {
	String dept;
	Prof hod;
	// constructor
	public Dept(String dept,Prof hod) {
		this.dept = dept;
		this.hod = hod;
	}
	
	// getter
	public String getName(String dept) {
		return this.hod.getName();
	}
	
	public String getDept() {
		return this.dept;
	}
	
}
