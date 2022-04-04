package com.revature.fsd.examples.objectcomparison;

public class StringComparableDemo {

	public static void main(String args[]) {
		String name1 = "John";
		String name2 = "Smith";
		
		System.out.println(name1.compareTo(name2));
		// ASCII value for J is 74
		// ASCII value for S is 83
		// 74 - 83 = -9
		
		// ASCII value for o is 111
		// ASCII value for a is 97
		// 111 - 97 = 14
	}
}
