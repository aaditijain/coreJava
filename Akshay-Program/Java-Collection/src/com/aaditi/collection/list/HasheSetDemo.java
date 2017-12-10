package com.aaditi.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HasheSetDemo 
{
public static void main(String arr[])
{
	HashSet<String> set = new HashSet<>();
	set.add("Aaditi");
	set.add("Shrishty");
	set.add("Monika");
	set.add(null);
	set.add(null);
	Iterator<String> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("Configuration due to for loop");
	for(String str:set)
	{
		
		System.out.println(str);
	}
}
}
