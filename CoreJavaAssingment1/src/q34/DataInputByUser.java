package q34;

import java.util.Scanner;

import com.javaTraining.Employee;

public class DataInputByUser {

	public static void main(String[] args) {
		// take data id,name,salary from user using scanner and display that data in
		// show method
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = s.nextInt();

		System.out.println("Enter employee name");
		String name = s.next();

		System.out.println("Enter employee salary");
		int salary = s.nextInt();

		Employee e = new Employee(id, name, salary);

		DataInputByUser d = new DataInputByUser();
		d.show(e);
	}

	public void show(Employee e) {
		// display data here by doing required changes
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
	}

}