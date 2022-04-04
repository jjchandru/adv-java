package com.revature.fsd.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class PersonFinder {
	
	public static void main(String[] args) {
		Person person1 = new Person(9000000001L, "John", 25);
		Person person2 = new Person(9000000002L, "Smith", 35);
		Person person3 = new Person(9000000003L, "Sophia", 22);
		Person person4 = new Person(9000000003L, "Emma", 28);
		
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		Person personToFind = new Person(9000000003L, "Emma", 28);
		personList.indexOf(personToFind);
	}

}
