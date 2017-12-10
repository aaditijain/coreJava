package com.aaditi.collection.list;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionWithComparable 
{
public  static void main(String arr[])
{
	 
TreeSet<Friend>	ts=new TreeSet<Friend>();
Friend f1=new Friend(1,"Aaditi");
Friend f2=new Friend(1,"Aaditi");
Friend f3=new Friend(2,"Heena");
Friend f4=new Friend(3,"Babita");
Friend f5=new Friend(4,"Reena");
ts.add(f1);
ts.add(f2);
ts.add(f3);
ts.add(f4);
ts.add(f5);
Iterator<Friend> itr=ts.iterator();
while(itr.hasNext())
{
	
	Friend  fr=(Friend)itr.next();
	System.out.println(fr.getId()+"  "+fr.getName());
}

	 
	
}
}
