package com.aaditi.immutable;

public class ImmutableDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Akshay");
		System.out.println(emp.getName());
		System.out.println(emp);
		emp=new Employee(2, "sf");
		System.out.println(emp);
	}

}
