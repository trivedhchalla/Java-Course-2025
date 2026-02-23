package studentOOP;

public class Test {

	
	public static void main(String[] args) {
		Prof professor = new Prof("Dr.Pandey","CSE");
		Dept department = new Dept("Dr.Pandey",professor);
		Student s1 = new Student(2323,"XYZ",department,professor);
		s1.display();
	}
	
}
