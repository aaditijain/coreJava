package com.aaditi.collection.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	private static void TreeMapOperation() {
		Map<Integer, String> map = new TreeMap<>();
		map.put(4, "Prafful");
		map.put(8, "Rachit");
		map.put(2, "Akshay");
		map.put(5, "Vipul");
		map.put(3, "Vaibhabh");
		map.put(9, "Sushil");
		map.put(1, "Rahul");
		map.put(8, "Deepmala");
		map.put(2, "Èkta");
		map.put(10, "Vipul");
		map.put(10, null); // no error because value can be null. Everything is
							// done based in Key only.
//		map.put(null, "dd");  //it will throw error because Key can't be null
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMapOperation();

	}

}
