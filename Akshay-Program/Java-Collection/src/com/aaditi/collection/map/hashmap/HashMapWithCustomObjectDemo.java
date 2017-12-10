package com.aaditi.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapWithCustomObjectDemo {

	public static void HashMapWithCustomObject() {
		HashMap<Employee, String> map = new HashMap<>();

		Employee emp1 = new Employee(1, "Akshay", "Male", "Bangalore");
		Employee emp2 = new Employee(5, "Rachit", "Kinner", "Pilahua");
		Employee emp3 = new Employee(8, "Aaditi", "Female (dpubt)", "USA");
		Employee emp4 = new Employee(2, "Sushant", "Male", "Noida");
		Employee emp5 = new Employee(1, "Akshay", "Male", "Bangalore");
		Employee emp6 = new Employee(7, "Rachit", "Male", "Bangalore");

		/*
		 * Here we are not overriding hashcode and equals method then it is
		 * returning different hashcode for all object and equals method also
		 * return false eg: emp1 and emp5 You can see hashcode of both object
		 * have different value
		 */
		System.out.println(emp1.hashCode());
		System.out.println(emp5.hashCode());
		System.out.println(emp1.equals(emp5));

		map.put(emp1, "A");
		map.put(emp2, "B");
		map.put(emp3, "C");
		map.put(emp4, "D");
		map.put(emp5, "E");
		map.put(emp6, "F");

		for (Entry<Employee, String> entry : map.entrySet()) {

			Employee emp = entry.getKey();
			System.out.println(emp.toString() + " ** Value : " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		HashMapWithCustomObject();
	}

}
