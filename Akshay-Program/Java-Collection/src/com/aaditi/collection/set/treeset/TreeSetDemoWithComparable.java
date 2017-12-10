package com.aaditi.collection.set.treeset;

import java.util.TreeSet;

public class TreeSetDemoWithComparable {

	public static void main(String[] args) {
		System.out.println("TreeSetDemo Start");

		TreeSet<Employee> set = new TreeSet<>();
		Employee emp1 = new Employee(1, "Akshay");
		Employee emp2 = new Employee(2, "Aaditi");
		Employee emp3 = new Employee(3, "Akshay");
		Employee emp4 = new Employee(2, "Sameer");
		Employee emp5 = new Employee(5, "Shubhi");
		Employee emp6 = new Employee(1, "Sandhya");

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		
		for (Employee employee : set) {
			System.out.println("Id : " + employee.getId() + " Name : " + employee.getName());
		}

	}

}
