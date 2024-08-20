package q33;

import com.javaTraining.Employee;

public class EmployeeDataProcess {

	public static void show(Employee emp) {
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSal());
	}

	public static void process(Employee emp) {
		emp.setId(101);
		emp.setName("sam");
		emp.setSal(1000);
	}

	public static void main(String[] args) {
		// do required changes in main,process and show method
		// create empty employee object here
		Employee e = new Employee();
		// add data into that empty object using process method
		EmployeeDataProcess.process(e);
		// display employee object with data in show method
		EmployeeDataProcess.show(e);
	}

}