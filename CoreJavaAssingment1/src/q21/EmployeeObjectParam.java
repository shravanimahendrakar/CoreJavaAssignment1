package q21;

import com.javaTraining.Employee;

public class EmployeeObjectParam {

	public static void m1(Employee e) {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// call m1 method from here
		Employee e = new Employee();
		EmployeeObjectParam.m1(e);
	}
}