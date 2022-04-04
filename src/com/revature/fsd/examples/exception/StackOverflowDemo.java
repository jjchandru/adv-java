package com.revature.fsd.examples.exception;

public class StackOverflowDemo {
	public static int count = 1;
	
	public static void main(String args[]) {
		recursiveFunction();
	}

	private static void recursiveFunction() {
		recursiveFunction();
	}

}
