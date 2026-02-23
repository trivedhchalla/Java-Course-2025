package oops;
// 4 access modifier public private default 
public class Student {		
		private long id;
		private String name;
		private String dept;
		
		// constuctor 
		public Student(long id,String name,String dept) {
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		// student id getter and setter
		public void setId(long id) {
			this.id = id;
		}
		public long getId() {
			return this.id;
		}
		
		// student name setter and getter
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		
		// student department setter and getter
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getDept() {
			return this.dept;
		}

		public static void main(String[] args) {
//			System.out.println(args[0]);
	        Student s1 = new Student(24034, "Trivedh", "CSE");
	        System.out.println("Id: " + s1.getId());
	        System.out.println("Name: " + s1.getName());
	        System.out.println("Department: " + s1.getDept());
	    }
}
		
		
		
		
		
		
		
		
