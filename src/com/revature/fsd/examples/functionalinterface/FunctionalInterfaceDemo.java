package com.revature.fsd.examples.functionalinterface;

public class FunctionalInterfaceDemo {
	public static void main(String args[]) {
		StringParamNoReturn stringParamNoReturn = e -> System.out.println(e);
		stringParamNoReturn.print("John");
	}
}
