package com.revature.fsd.examples.generics;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(5));
		list.add("John");
		list.add(new Person(9000000001L, "John", 25));
		for (int i = 0; i < list.size(); i++) {
			Integer number = (Integer) list.get(i);
			System.out.println(number);
		}

		/*ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person(9000000001L, "John", 25));
		for (Person person : persons) {
			System.out.println(person);
		}*/

	}

}
