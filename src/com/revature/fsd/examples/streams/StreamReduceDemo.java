package com.revature.fsd.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30);
		int total = numbers.stream()
				.reduce(0, (subtotal, element) -> subtotal + element);
		System.out.println(total);
	}

}
