package com.revature.fsd.examples.objectcomparison;

public class ObjectComparisonDemo {
	
	private static void compareWithAssignmentOperator1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1 == obj2); // false
	}

	private static void compareWithAssignmentOperator2() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		System.out.println(obj1 == obj2); // true
	}

	private static void compareWithEqualsFunction() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2)); // false
	}

	public static void main(String[] args) {
		compareWithAssignmentOperator1();
		compareWithAssignmentOperator2();
		compareWithEqualsFunction();
	}


}
