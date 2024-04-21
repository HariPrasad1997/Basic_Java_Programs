package javaTest;

import java.util.Scanner;

/**
 * Write a program to find square root cube root of integer
 * 
 */
public class FindSqaureCubeSqrt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		Long number = scanner.nextLong();
		System.out.println("Square root of " + number + " is:" + Math.pow(number, 2));
		System.out.println("Cube of " + number + " is: " + Math.pow(number, 3));
		scanner.close();
	}

}
