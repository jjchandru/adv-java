package com.revature.fsd.examples.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Smith");
		names.add("Emma");
		names.add("Julia");
		names.add("Sophia");
		names.add("James");
		names.add("John");
		System.out.println(names);
	}

}
