package com.revature.fsd.examples.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> employees = new HashMap<>();
		employees.put(1001, "John");
		employees.put(1002, "Smith");
		employees.put(1003, "Emma");
		employees.put(1004, "Elliot");
		employees.put(1005, "Julia");
		employees.put(1006, "Sophia");
		employees.put(1001, "James"); // overwrites the existing value
		System.out.println(employees);
		
		for (Integer employeeId : employees.keySet()) {
			System.out.println(employees.get(employeeId));
		}
	}

}
