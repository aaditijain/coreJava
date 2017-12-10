package com.aaditi.collection.set.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemoWithComparator {

	public static void main(String[] args) {

		TreeSet<Person> set = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Choice on Which you want person");
		System.out.println("Enter 1 For Id");
		System.out.println("Enter 2 For Name");
		System.out.println("Enter 3 For Id And Name");

		int choice = sc.nextInt();
		if (choice == 1) {
			set = new TreeSet<>(new PersonIdComparator());
		} else if (choice == 2) {
			set = new TreeSet<>(new PersonNameComparator());
		} else if (choice == 3) {
			set = new TreeSet<>(new PersonComparator());
		} else {
			System.out.println("Not a valid input");
			return;
		}

		Person emp1 = new Person(1, "Akshay");
		Person emp6 = new Person(1, "Sandhya");
		Person emp2 = new Person(2, "Aaditi");
		Person emp3 = new Person(3, "Akshay");
		Person emp4 = new Person(2, "Sameer");
		Person emp5 = new Person(5, "Shubhi");

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		for (Person person : set) {
			System.out.println("Id : " + person.getId() + " Name : " + person.getName());
		}
	}
}
