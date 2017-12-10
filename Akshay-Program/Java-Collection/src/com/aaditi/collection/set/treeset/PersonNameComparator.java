package com.aaditi.collection.set.treeset;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		return person1.getName().compareTo(person2.getName());
	}

}
