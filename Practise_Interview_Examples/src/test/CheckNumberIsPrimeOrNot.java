package test;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int number = scan.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < number / 2; i++) {
			if (number % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + " is Prime Number");
		} else {
			System.out.println(number + " is not PrimeNumber");
		}
	}

}
