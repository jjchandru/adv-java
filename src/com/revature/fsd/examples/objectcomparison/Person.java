package com.revature.fsd.examples.objectcomparison;

public class Person {
	private long mobileNumber;
	private String name;
	private int age;

	public Person(long mobileNumber, String name, int age) {
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	@Override
	public String toString() {
		return "Person [mobileNumber=" + mobileNumber + ", name=" + name + ", age=" + age + "]";
	}
}
