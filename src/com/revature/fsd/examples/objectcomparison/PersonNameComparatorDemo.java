package com.revature.fsd.examples.objectcomparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonNameComparatorDemo {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
			new Person(9000000001L, "John", 25),
			new Person(9000000002L, "Smith", 35),
			new Person(9000000003L, "Sophia", 22),
			new Person(9000000003L, "Emma", 28)
		);
		System.out.println("Sorting by name:");
		Collections.sort(personList, new PersonNameComparator());
		personList.stream().forEach(System.out::println);
		/*System.out.println("\nSorting by age:");
		Collections.sort(personList);
		personList.stream().forEach(System.out::println);*/
	}

}
