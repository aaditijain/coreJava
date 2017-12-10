package com.aaditi.collection.set.linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Rachit");
		set.add("Aaditi");
		set.add("Vipul");
		set.add("Sushil");
		set.add("Prafuul");
		set.add("Vipul");
		set.add("Rachit");

		System.out.println("Print Set Using Iterator");

		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		System.out.println("Print Set Using For Each Loop");
		
		for (String val : set) {
			System.out.println(val);
		}
	}

}
