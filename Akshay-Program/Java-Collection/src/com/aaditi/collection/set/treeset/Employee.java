package com.aaditi.collection.set.treeset;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
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

	/*
	 * @Override public int compareTo(Employee employee) {
	 * 
	 * if (this.getId() == employee.getId()) { return 0; } else if (this.getId()
	 * > employee.getId()) { return 1; } else if (this.getId() <
	 * employee.getId()) { return -1; }
	 * 
	 * return 0;
	 * 
	 * }
	 */

/*	@Override
	public int compareTo(Employee employee) {
		return employee.getName().compareTo(this.getName());
	}
*/	
	@Override
	public int compareTo(Employee employee) {
		
		if(this.id == employee.getId()){
			return this.getName().compareTo(employee.getName());
		} else if(this.id > employee.getId()){
			return 1;
		} else if(this.id < employee.getId()){
			return -1;
		}
		return 0;
	}

}
