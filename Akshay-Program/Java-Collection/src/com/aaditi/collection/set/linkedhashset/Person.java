package com.aaditi.collection.set.linkedhashset;

public class Person {

	private int id;
	private String name;
	private String address;

	public Person(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 127 * this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.getId() == p.getId() && this.getName().equals(p.getName());
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Id :- " + this.getId() + " Name :- " + this.getName() + " Address :- " + this.getAddress();
	}
}
