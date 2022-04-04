package com.revature.fsd.examples.exception;

import java.util.Scanner;

public class UncheckedExceptionDemo {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = scanner.nextInt();
		System.out.println("Age: " + age);
	}

}
