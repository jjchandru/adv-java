package com.revature.fsd.examples.objectcomparison;

public class StringComparisonDemo {

	public static void main(String[] args) {
		compareSameString();
		compareDifferentString();
	}

	private static void compareSameString() {
		String name1 = "John";
		String name2 = "John";
		System.out.println(name1 == name2); // from string pool, so true
		System.out.println(name1.equals(name2)); // overridden equals() method, true
	}

	private static void compareDifferentString() {
		Iterable iterable;
		String name1 = "John";
		String name2 = "Smith";
		System.out.println(name1 == name2); // from string pool, so false
		System.out.println(name1.equals(name2)); // overridden equals() method, false
	}

}
