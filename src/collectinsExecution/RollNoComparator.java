package collectinsExecution;

import java.util.*;

public class RollNoComparator implements Comparator<Student>{
	@Override
	public int compare (Student s1, Student s2) {
		return Double.compare(s1.getRollNo(),s2.getRollNo());
	}
	
}
