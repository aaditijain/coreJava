package com.aaditi.collection.list;
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo 
{
	
	

	private static void MapWithWraper() {
		HashMap<Child,String> hs=new HashMap<Child,String>();
		Child c1=new Child(1,"Aaditi");
		Child c2=new Child(2,"Reena");
		Child c3=new Child(3,"Parul");
		Child c4=new Child(1,"Aaditi");
		System.out.println(c1.equals(c4));
		hs.put(c1, "hi");
		hs.put(c2, "hello");
		hs.put(c3, "goodMorning");
		hs.put(c4, "goodnight");
		
		for(Entry<Child, String> entry:hs.entrySet())
		{
			Child c=entry.getKey();
			System.out.println(c.toString()+"   "+entry.getValue());
		}
		
	}
	public static void main(String arr[])
{
MapWithWraper();	
	
	
}

}
