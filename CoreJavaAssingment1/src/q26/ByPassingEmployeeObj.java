package q26;

import com.javaTraining.Employee;

public class  ByPassingEmployeeObj{

	public static void m1(Object o){
		System.out.println("Employee id: "+((Employee) o).getId()+"\nEmployee name: "+((Employee) o).getName()+"\nEmployee Salary: "+((Employee) o).getSal());
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee emp=new Employee(101,"Sam",1000);
		ByPassingEmployeeObj.m1(emp);
	}
}