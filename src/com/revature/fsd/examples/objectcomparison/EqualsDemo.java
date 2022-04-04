package com.revature.fsd.examples.objectcomparison;

public class EqualsDemo {

	public static void main(String args[]) {
		Person person1 = new Person(9000000001L, "John", 25);
		Person person2 = new Person(9000000001L, "John", 25);
		
		System.out.println(person1.equals(person2));
	}
}
