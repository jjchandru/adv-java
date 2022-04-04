package com.revature.fsd.examples.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		try {
			System.out.println("Enter age:");
			age = scanner.nextInt();
			String name = null;
			name.charAt(0);
		} catch (InputMismatchException e) {
			System.out.println("Incorrect value.");
		} finally {
			System.out.println("Finally block.");
		}
		System.out.println("Age: " + age);
	}

}
