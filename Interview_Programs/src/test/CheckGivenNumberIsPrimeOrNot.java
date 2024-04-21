package test;

import java.util.Scanner;

/**
 * Write a program to check weather given number is prime or not
 * 
 * @author hkathi
 *
 */

public class CheckGivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is PrimeNumber");
		} else {
			System.out.println(number + " is not PrimeNumber");
		}
		input.close();
	}

	private static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
