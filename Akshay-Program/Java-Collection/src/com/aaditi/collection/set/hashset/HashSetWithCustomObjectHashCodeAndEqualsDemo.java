package com.aaditi.collection.set.hashset;

import java.util.HashSet;

public class HashSetWithCustomObjectHashCodeAndEqualsDemo {

	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<>();
		Person emp1 = new Person(1, "Rachit", "Noida");
		Person emp2 = new Person(2, "Aaditi", "Ghaziabad");
		Person emp3 = new Person(1, "Rachit", "Pilakhua");
		Person emp4 = new Person(2, "Sameer", "Budaun");
		Person emp5 = new Person(5, "Shubhi", "Barielly");
		Person emp6 = new Person(3, "Sandhya", "Kanpur");

		System.out.println(set.add(emp1));
		System.out.println(set.add(emp2));
		System.out.println(set.add(emp3));
		System.out.println(set.add(emp4));
		System.out.println(set.add(emp5));
		System.out.println(set.add(emp6));

		for (Person person : set) {
			System.out.println(person.toString());
		}
	}
}
