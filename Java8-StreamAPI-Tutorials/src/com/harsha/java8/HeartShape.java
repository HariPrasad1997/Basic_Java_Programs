package com.harsha.java8;

import java.util.Scanner;

public class HeartShape {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Heart Shape Using Pyramid Patterns Generator");
		System.out.println("Enter the size of the heart");
		int size = scanner.nextInt();

		// Informing the user that the heart pattern is being generated
		System.out.println("Generating heart shape....");

		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= 4 * size; j++) {
				// Using the distance formula to determine the boundary of the heart
				double d1 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - size, 2));
				double d2 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - 3 * size, 2));

				// Printing '*' within the boundaries of the heart shape
				if (d1 < size + 0.5 || d2 < size + 0.5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Newline after each row
			System.out.println();
		}

		// Lower part of the heart shape
		for (int i = 1; i < 2 * size; i++) {
			// Printing leading spaces for the lower part
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// Printing '*' for the lower part of the heart
			for (int j = 0; j < 4 * size + 1 - 2 * i; j++) {
				System.out.print("*");
			}
			// Newline after each row
			System.out.println();
		}

		// Closing the scanner object
		scanner.close();
	}

}
