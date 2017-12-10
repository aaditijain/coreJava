package com.aaditi.string;

public class StringComparisionDemo {

	private static void compare() {
		String s1 = new String("Akshay");
		String s2 = "Akshay";
		String s3 = new String("Akshay");
		String s4 = "Akshay";
		String s5 = s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		System.out.println(s5 == s1); // T

		s5 = s5 + " Gupta";

		// Comparision

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		System.out.println(s1 == s2); // F
		System.out.println(s1.equals(s2)); // T
		System.out.println(s1 == s3); // F
		System.out.println(s1.equals(s3)); // T
		System.out.println(s2 == s4); // T
		System.out.println(s3.equals(s4)); // T
		System.out.println(s5 == s1); // F
		System.out.println(s5.equals(s1)); // F
		System.out.println(s1 == s2); // F
	}

	public static void main(String[] args) {
		compare();
	}
} 
