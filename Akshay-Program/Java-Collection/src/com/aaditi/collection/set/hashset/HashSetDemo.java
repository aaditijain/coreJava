package com.aaditi.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Rachit");
		set.add("Aaditi");
		set.add("Vipul");
		set.add("Sushil");
		set.add("Prafuul");
		set.add("Vipul");
		set.add("Rachit");
		set.add(null);

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
