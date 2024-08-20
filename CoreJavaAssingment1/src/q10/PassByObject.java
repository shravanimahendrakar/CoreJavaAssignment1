package q10;

import com.javaTraining.Employee;

public class PassByObject {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		PassByObject d = new PassByObject();
		d.show(emp);
		emp.setSal(emp.getSal() + 100);// bonus
		d.show(emp);
	}

	public void show(Employee e) {
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
	}
}
