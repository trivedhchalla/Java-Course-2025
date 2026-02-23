	package studentOOP;
	
	public class Prof {
		
		String name;
		String dept;
		
		// constructor
		public Prof(String name,String dept){
			this.name = name;
			this.dept = dept;
		}
		// getter and setter methods
		public String getDept(String name) {
			return this.dept;
		}	
		public String getName() {
			return this.name;
		}
	}