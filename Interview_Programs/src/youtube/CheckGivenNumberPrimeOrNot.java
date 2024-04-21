package youtube;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckGivenNumberPrimeOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is Prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
		printPrimeNumbers(2, 100);
		scanner.close();
	}

	// check number is prime or not traditional approach
	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// print prime numbers from 1 to 100
	private static void printPrimeNumbers(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + "total prime numbers: " + count);
	}

}
