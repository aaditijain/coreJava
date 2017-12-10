package com.aaditi.collection.set.treeset;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		if (person1.getId() == person2.getId()) {
			return person1.getName().compareTo(person2.getName());
		} else if (person1.getId() > person2.getId()) {
			return 1;
		} else if (person1.getId() < person2.getId()) {
			return -1;
		}
		return 0;

	}

}
