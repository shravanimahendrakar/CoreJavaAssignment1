package q24;

import com.javaTraining.Employee;

public class ObjectDataDisplay {

	public static void m1(Employee e) {
		System.out.println("Employee id: " + e.getId() + "\nEmployee name: " + e.getName() + "\nEmployee Salary: " + e.getSal());
	}

	public static void main(String[] args) {
		// call m1 method from here
		Employee emp = new Employee(103, "max", 1000);
		ObjectDataDisplay.m1(emp);
	}
}