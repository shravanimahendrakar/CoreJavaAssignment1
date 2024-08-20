package q23;

import com.javaTraining.Employee;

public class ObjectParam {

	public static void m1(Object o) {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// call m1 method from here
		Employee e = new Employee();
		ObjectParam.m1(e);
	}
}