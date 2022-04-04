package com.revature.fsd.examples.collection;

public class Person {
	private long mobileNumber;
	private String name;
	private int age;

	public Person(long mobileNumber, String name, int age) {
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() - " + mobileNumber);
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
		return result;
	}
	
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		System.out.println(mobileNumber + " - " + other.mobileNumber);
		return mobileNumber == other.mobileNumber;
	}
}
