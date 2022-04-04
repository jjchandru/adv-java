package com.revature.fsd.examples.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileCopyDemo {

	public static void main(String[] args) {
		try {
			FileInputStream reader = new FileInputStream("D:\\googlelogo.png");
			FileOutputStream writer = new FileOutputStream("D:\\googlelogo-copy.png");
			
			int character = reader.read();
			
			while (character != -1) {
				System.out.print((char) character);
				writer.write(character);
				character = reader.read();
			}
			
			writer.close();
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		} catch (IOException e) {
			System.out.println("Error when reading or writing file.");
		}
	}

}
