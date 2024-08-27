package q55;

import com.javaTraining.Employee;

public class EqualComparatorDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(11, "shravani", 1330);
		Employee e2=new Employee(11, "shravani", 1330);
		
		System.out.println(e1.equals(e2));

	}

	
}
