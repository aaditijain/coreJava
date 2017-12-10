package com.aaditi.collection.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.aaditi.collection.map.treemap.Employee;

public class TreeMapWithCustomObjectDemo {

	private static void treeMapWithCustomObject() {
		Map<Employee, String> map = new TreeMap<>();
		Employee emp1 = new Employee(1, "Akshay", "Male", "Bangalore");
		Employee emp2 = new Employee(5, "Rachit", "Kinner", "Pilahua");
		Employee emp3 = new Employee(8, "Aaditi", "Female (dpubt)", "USA");
		Employee emp4 = new Employee(2, "Sushant", "Male", "Noida");
		Employee emp5 = new Employee(1, "Akshay", "Male", "USA");
		Employee emp6 = new Employee(7, "Rachit", "Male", "Bangalore");

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
		// TODO Auto-generated method stub
		treeMapWithCustomObject();
	}
}
