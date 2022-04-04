package com.revature.fsd.examples.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingDemo {
	
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Smith");
		names.add("Emma");
		names.add("Julia");
		names.add("Sophia");
		names.add("James");
		Collections.sort(names);
		System.out.println(names);
	}

}
