package com.revature.fsd.examples.streams;

public class Person {
	private long id;
	private String name;
	private int age;

	public Person(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		System.out.println("hashCode() - " + id);
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		System.out.println(id + " - " + other.id);
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
