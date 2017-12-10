package com.aaditi.immutable;

public final class Employee {

	private final int Id;
	private final String Name;
	
	public Employee(int Id, String Name){
		this.Id=Id;
		this.Name=Name;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}
}
