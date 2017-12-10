package com.aaditi.collection.list;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CustomList 
{

	
	
	public static void main(String[] args)
	{
		Employee e1=new Employee(1,"aaditi","Sonu");
		Employee e2=new Employee(2,"Reena","aafgg");
		Employee e3=new Employee(3,"Bbita","dffgf");
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
	   java.util.Iterator itr=al.iterator();
	   while(itr.hasNext())
	   {
		   Employee st=(Employee)itr.next();
		   System.out.println(st.rollno+" "+st.name+" "+st.address);
	   }
	   }
	   
	   
		
		
		

	

}
