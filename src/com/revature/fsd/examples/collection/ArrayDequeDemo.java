package com.revature.fsd.examples.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> bookingQueue = new ArrayDeque<>();
		bookingQueue.add("John");
		bookingQueue.add("Smith");
		bookingQueue.add("Emma");
		bookingQueue.add("Julia");
		bookingQueue.add("Sophia");
		bookingQueue.add("James");
		bookingQueue.add("John");

		while (!bookingQueue.isEmpty()) {
			String name = bookingQueue.poll();
			System.out.println(name);
		}
	}

}
