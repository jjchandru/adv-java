package com.revature.fsd.examples.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> names = new TreeSet<>();
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
