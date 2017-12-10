package com.aaditi.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListNew 
{
public static void main(String arr[])
{
ArrayList al=new ArrayList();
al.add("Reena");
al.add("Shivi");
al.add(1);
ArrayList al1=new ArrayList();
al1.add("Reena");

al1.add(1);
al1.add(2);
al.retainAll(al1);
Iterator itr=al.iterator();
while(itr.hasNext())
{
	
System.out.println(itr.next());
}



	
	
}
}
