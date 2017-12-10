package com.aaditi.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Map works on key and value pair
 * Key and value also know as Entry
*/
public class HashMapDemo {

	public static void mapWithWrapperClass() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Akshay");
		map.put(5, "Rachit"); // it will be override with 5, rachit drta hai
								// akshay se
		map.put(7, "Aaditi rachit ki bhen hai");
		map.put(1, "Akshay se aaditi  bhut pyar krti hai");
		map.put(2, "Shadhi  hogi akshay and aaditi ki");
		map.put(6, "Aaditi ki maa ko akshay ka pranam");
		map.put(5, "Rachit darta hai akshay se");
		map.put(null, "Rachit darta hai akshay se");
		map.put(null, "sd;dfdkl,sekfyiuhfi");
		map.put(10, null);
		map.put(14, null);

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Id: " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		mapWithWrapperClass();
	}
}
