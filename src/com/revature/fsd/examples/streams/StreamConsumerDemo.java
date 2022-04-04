package com.revature.fsd.examples.streams;

import java.util.Arrays;
import java.util.List;

public class StreamConsumerDemo {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "grapes", "orange");
		fruits.stream().forEach(e -> System.out.println(e));
		fruits.stream().forEach(System.out::println);
	}
}
