package com.revature.fsd.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomGenericsDemo {

	public static List<Integer> toList(Integer ... values) {
		List<Integer> items = new ArrayList<>();
		for (Integer item : values) {
			items.add(item);
		}
		
		return items;
	}
	
	public static <T> List<T> toGenericList(T ... values) {
		List<T> items = new ArrayList<>();
		for (T item : values) {
			items.add(item);
		}
		
		return items;
	}
	
	public static void main(String args[]) {
		List<Integer> numbers = toGenericList(5, 4, 7, 10);
		List<String> names = toGenericList("orange", "grapes", "apple");
		System.out.println(numbers);
		System.out.println(names);
	}

}
