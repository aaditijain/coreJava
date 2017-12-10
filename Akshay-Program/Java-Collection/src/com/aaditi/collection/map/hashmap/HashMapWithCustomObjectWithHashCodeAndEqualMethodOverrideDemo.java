package com.aaditi.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWithCustomObjectWithHashCodeAndEqualMethodOverrideDemo {

	private static void hashMapWithCustomObjectWithHashCodeAndEqualMethodOverride() {
		Map<Person, String> map = new HashMap();

		Person emp1 = new Person(1, "Akshay", "Male", "Bangalore");
		Person emp2 = new Person(5, "Rachit", "Kinner", "Pilahua");
		Person emp3 = new Person(8, "Aaditi", "Female (dpubt)", "USA");
		Person emp4 = new Person(2, "Sushant", "Male", "Noida");
		Person emp5 = new Person(1, "Akshay", "Male", "Bangalore");
		Person emp6 = new Person(7, "Rachit", "Male", "Bangalore");
		Person emp7 = new Person(5, "Rachit", "KINNER", "Agra");
		Person emp8 = new Person(5, "Viput", "KINNER", "Agra");

		/*
		 * Here we are overriding hashcode and equals method then it is
		 * returning same hashcode for same object and equals method also return
		 * true based on our implementation in hashcode and equals metod eg:
		 * emp1 and emp5 You can see hashcode of both object have same value
		 */
		// this is for emp1 and emp 5
		System.out.println(emp1.hashCode());
		System.out.println(emp5.hashCode());
		System.out.println(emp1.equals(emp5));

		// this is for emp2 and emp 7
		System.out.println(emp2.hashCode());
		System.out.println(emp7.hashCode());
		System.out.println(emp2.equals(emp7));

		System.out.println(emp7.hashCode());
		System.out.println(emp8.hashCode());
		System.out.println(emp7.equals(emp8));

		map.put(emp1, "A");
		map.put(emp2, "B");
		map.put(emp3, "C");
		map.put(emp4, "D");
		map.put(emp5, "E");
		map.put(emp6, "F");
		map.put(emp7, "F");
		map.put(emp8, "F");

		for (Entry<Person, String> entry : map.entrySet()) {
			Person emp = entry.getKey();
			System.out.println(emp.toString() + " ** Value : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapWithCustomObjectWithHashCodeAndEqualMethodOverride();
	}

}
