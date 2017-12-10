/**
 * 
 */
package com.aaditi.collection.set.hashset;

import java.util.HashSet;

import com.aaditi.collection.set.hashset.Employee;

/**
 * @author Aaditi
 *
 */
public class HashSetWithCustomObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<Employee> set = new HashSet<>();
		Employee emp1 = new Employee(1, "Rachit");
		Employee emp2 = new Employee(2, "Aaditi");
		Employee emp3 = new Employee(1, "Rachit");
		Employee emp4 = new Employee(2, "Sameer");
		Employee emp5 = new Employee(5, "Shubhi");
		Employee emp6 = new Employee(3, "Sandhya");

		System.out.println(set.add(emp1));
		System.out.println(set.add(emp2));
		System.out.println(set.add(emp3));
		System.out.println(set.add(emp4));
		System.out.println(set.add(emp5));
		System.out.println(set.add(emp6));
		System.out.println(set.add(emp6));

		for (Employee employee : set) {
			System.out.println("Id : " + employee.getId() + " Name : " + employee.getName());
		}
	}

}
