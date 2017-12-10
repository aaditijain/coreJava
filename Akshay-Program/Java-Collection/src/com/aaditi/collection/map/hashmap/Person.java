package com.aaditi.collection.map.hashmap;

public class Person {

	private int id;
	private String name;
	private String gender;
	private String address;

	public Person(int id, String name, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return 21 * getId();
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return person.getId() == this.getId() && person.name.equals(this.getName());
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
