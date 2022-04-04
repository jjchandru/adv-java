package com.revature.fsd.examples.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		try {
			System.out.println("Enter age:");
			age = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Incorrect value.");
		}
		System.out.println("Age: " + age);
	}

}
