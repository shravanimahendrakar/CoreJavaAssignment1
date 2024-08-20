package q5;

import com.javaTraining.Employee;

public class EmployeeStaticShowDemo {

	public static void main(String[] args) {
		Employee employee=new Employee(101,"sam",1000);
		EmployeeStaticShowDemo.show(employee);
	}
	
	public static void show(Employee emp) {
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
	}
}
