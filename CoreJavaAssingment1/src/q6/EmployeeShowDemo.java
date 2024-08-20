package q6;

import com.javaTraining.Employee;

public class EmployeeShowDemo {

	public void show(Employee emp) {
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee(101,"sam",1000);
		EmployeeShowDemo demo=new EmployeeShowDemo();
		demo.show(employee);
	}
}
