package q57;

import com.javaTraining.Employee;

public class CampareReferenceDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "shravani", 1000);
		Employee e2 = new Employee(12, "sam", 1200);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
