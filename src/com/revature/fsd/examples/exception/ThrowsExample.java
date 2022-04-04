package com.revature.fsd.examples.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("");
	}

}
