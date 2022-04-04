package com.revature.fsd.examples.objectcomparison;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] numbers = {9, 4, 7, 1, 8, 4};
		int i, j, temp;
		for (i = 0; i < numbers.length; i++) {
			for (j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
