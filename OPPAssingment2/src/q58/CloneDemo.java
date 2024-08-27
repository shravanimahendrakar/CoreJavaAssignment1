package q58;

import com.javaTraining.Employee;

public class CloneDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "shravani", 1000);
		e1.x=10;
		Employee clonedEmp=e1;
		
		System.out.println(clonedEmp.x);
		System.out.println(clonedEmp);
	}

}
