package q9;

import com.javaTraining.Employee;

public class EmployeeObjectPassing {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		EmployeeObjectPassing.show(emp);
		emp.setSal(emp.getSal() + 100);// bonus
		EmployeeObjectPassing.show(emp);
	}

	public static void show(Employee e) {
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
	}
}
