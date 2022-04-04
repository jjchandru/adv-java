package com.revature.fsd.examples.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String args[]) {
		
		Queue<String> bookingQueue = new PriorityQueue<>();
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
