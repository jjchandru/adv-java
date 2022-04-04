package com.revature.fsd.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 5, 10, 25, 9, 3, 8, 5);
		numbers.stream()
			.map(e -> e * 2)
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}

}
