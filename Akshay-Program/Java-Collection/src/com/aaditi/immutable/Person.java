package com.aaditi.immutable;

public final class Person {

	private final int Id;
	private final String Name;
	private final Address address;    //association

	public Person(int Id, String Name, Address address) {
		this.Id = Id;
		this.Name = Name;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public Address getAddress() {
		return address;
	}

}
