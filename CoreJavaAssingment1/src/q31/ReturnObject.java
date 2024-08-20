package q31;

import com.javaTraining.Employee;

public class ReturnObject {

	public static Object m1() {
		// create Employee object here and return
		// don’t change m1 method prototype i.e return type or access specifier
		Employee e = new Employee(101, "sam", 1000);
		return e;
	}

	public static void main(String[] args) {
		// call m1 method and catch returned employee object here
		// display returned employee data here
		Object emp = ReturnObject.m1();
		System.out.println(((Employee) emp).getId() + " " + ((Employee) emp).getName() + " " + ((Employee) emp).getSal());
	}

}