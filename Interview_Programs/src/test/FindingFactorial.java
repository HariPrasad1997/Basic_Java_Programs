package test;

import java.util.Scanner;

/**
 * Write a Program to print factorial of given number
 * 
 * @author hkathi
 *
 */

public class FindingFactorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int number = scan.nextInt();
		int factorial = fact(number);
		System.out.println("factorial of " + number + " is " + factorial);
		scan.close();
	}

	private static int fact(int number) {
		if (number == 1) {
			return 1;
		}
		return number * fact(number - 1); // 5 * 4 * 3 * 2 * 1 = 120
	}

}
