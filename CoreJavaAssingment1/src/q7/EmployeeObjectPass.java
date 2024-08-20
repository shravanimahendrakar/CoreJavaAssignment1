package q7;

import com.javaTraining.Employee;

public class EmployeeObjectPass {

	public static void show(Employee emp1) {
		System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSal());		
	}
	
	public static void main(String[] args) {
		Employee employee1=new Employee(101,"sam",1000);
		Employee employee2=new Employee(102,"john",1500);
		
		EmployeeObjectPass.show(employee1);
		EmployeeObjectPass.show(employee2);
	}
}
