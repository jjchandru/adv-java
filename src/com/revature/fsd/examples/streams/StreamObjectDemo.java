package com.revature.fsd.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamObjectDemo {
	
	public static void main(String args[]) {
		List<Person> personList = Arrays.asList(
				new Person(1, "John", 10),
				new Person(2, "Smith", 20),
				new Person(3, "Emma", 30),
				new Person(4, "Susan", 12)
		);
		personList.stream()
			.filter(e -> e.getAge() < 18)
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}

}
