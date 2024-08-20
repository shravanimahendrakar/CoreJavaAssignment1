package q2;

import com.javaTraining.Employee;

public class CreateObject {

	public static void main(String[] args) {
		Employee employee=new Employee(101,"sam",1000);
		
		System.out.println("Employe id: "+employee.getId());
		System.out.println("Employe Name: "+employee.getName());
		System.out.println("Employe Salary: "+employee.getSal());
	}

}
