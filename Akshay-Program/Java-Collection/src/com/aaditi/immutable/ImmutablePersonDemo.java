package com.aaditi.immutable;

public class ImmutablePersonDemo {

	public static void main(String[] args) {

		Address address = new Address(420, "Noida");
		Person person = new Person(1, "Akshay", address);
		
		System.out.println(person.getAddress().getStreet());
		
		Address address1 = person.getAddress();
		address1.setStreet("Ghaziabad");
		
		
		System.out.println(person.getAddress().getStreet());
				
		System.out.println(person.getName());
		System.out.println(person);
	}

}
