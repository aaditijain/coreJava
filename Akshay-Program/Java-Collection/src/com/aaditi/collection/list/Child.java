package com.aaditi.collection.list;

import com.aaditi.collection.map.hashmap.Person;

public class Child 
{
private int id;

private String name;

public Child(int id,String name)
{
	
	this.setId(id);
	this.setName(name);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


public String toString()
{
	return "Id :- " + this.getId() + " Name :- " + this.getName();
}
@Override
public int hashCode() {
	return 21 * getId();
}

@Override
public boolean equals(Object obj) {
	Child c = (Child) obj;
	return c.getId() == this.getId() && c.name.equals(this.getName());
}


}
