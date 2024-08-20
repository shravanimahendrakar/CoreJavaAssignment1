package q25;

import com.javaTraining.Employee;

public class PassMemberVariable {
	
	public static void m1(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// call m1 method from here
		Employee emp = new Employee(101, "Sam", 1000);
		PassMemberVariable.m1(emp.getId());
	}

}