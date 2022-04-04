package com.revature.fsd.examples.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String args[]) {
		Person person1 = new Person(9000000001L, "John", 25);
		Person person2 = new Person(9000000002L, "Smith", 35);
		Person person3 = new Person(9000000003L, "Sophia", 22);
		Person person4 = new Person(9000000003L, "Emma", 28);
		
		List<Person> personList = new LinkedList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		Person personToFind = new Person(9000000003L, "Emma", 28);
		personList.indexOf(personToFind);
		
		personList.remove(0); // removes first item
		personList.contains(personToFind); // find if an item is present
		Person person = personList.get(0); // get an item based on index
		personList.size(); // returns number of items in the list

	}
}
