package q52;

import com.javaTraining.Employee;

public class ToStringOverrideDemo {

	public static void main(String[] args) {
		Employee e=new Employee(11, "shravani", 1000);
		
		//call the override tostring() from Employee class of package com.javaTraining
		System.out.println(e);
	}
}
