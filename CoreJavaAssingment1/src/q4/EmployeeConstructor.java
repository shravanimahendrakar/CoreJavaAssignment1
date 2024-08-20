package q4;

import com.javaTraining.Employee;

public class EmployeeConstructor {

	public static void main(String[] args) {
		Employee employee=new Employee(101,"sam",1000);
		System.out.println("Employee id: "+employee.getId()+"\nEmployee name: "+employee.getName()+"\nEmployee Salary: "+employee.getSal());
	}
}
