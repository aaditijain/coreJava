package com.aaditi.collection.hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	private static void hashTableDemo() {
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(5, "A");
		hashTable.put(7, "B");
		hashTable.put(3, "C");
		hashTable.put(9, "D");
		hashTable.put(12, "E");
		hashTable.put(65, "F");
		hashTable.put(65, "G");
		
//		hashTable.put(null, "sdfsdf");  //it will throw error Because hashtable doesn't allow null key
//		hashTable.put(398, null);    //it will throw error because HashTable doesn't allow null value also
		System.out.println("Initial Size :- " + hashTable.size());

		for (Entry<Integer, String> entry : hashTable.entrySet()) {
			//hashTable.remove(entry.getKey());
			hashTable.put(65,"fsd");  //Key is already present in Hashtable So it will only update the value
			System.out.println("During Iteration update exisiting key value:- " + hashTable.size());
			
	//		hashTable.put(651,"fsd");  //this is new key so it will insert (or increase hashtable size at runtime)  So it will cause of co ncurrent modification exception
			System.out.println("During Iteration if insert or re0move new key :- " + hashTable.size());
			
			
			System.out.println("Key : " + entry.getKey() + " Value :- " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashTableDemo();
	}

}
