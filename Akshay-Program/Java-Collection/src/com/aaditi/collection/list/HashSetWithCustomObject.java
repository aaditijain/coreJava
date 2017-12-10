package com.aaditi.collection.list;
import java.util.HashSet;

public class HashSetWithCustomObject
{
public static void main(String arr[])
{
	
HashSet<Person> set=new HashSet<>();
	
Person p1=new Person(1,"Aaditi");
Person p2=new Person(1,"Aaditi");	
Person p3=new Person(2,"Reena");
Person p4=new Person(3,"Babita");
System.out.println(set.add(p1));
System.out.println(set.add(p2));
System.out.println(set.add(p3));
System.out.println(set.add(p4));
System.out.println("Hello");

for(Person p:set)
{
	
	System.out.println(p.toString());
}


	
}
}
