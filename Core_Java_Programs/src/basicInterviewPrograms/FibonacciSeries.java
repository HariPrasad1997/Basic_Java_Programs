package basicInterviewPrograms;

import java.util.Scanner;

/**
 * Fibonacci series is a sequence where each number is sum of the two preceding
 * ones, usually starting with 0 and 1
 */
public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers of terms in the Fibonacci to display: ");
		int count = scanner.nextInt();

		int firstTerm = 0;
		int secondTerm = 1;

		for (int i = 1; i <= count; i++) {
			System.out.println(firstTerm + " ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
