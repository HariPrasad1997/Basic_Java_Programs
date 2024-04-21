package basicInterviewPrograms;

import java.util.Scanner;

public class FindFactorialOfGivenNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = s.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i; // 1 * 1= 1; 1 * 2= 2; 1 * 3 = 3 and so onn..
		}
		System.out.println("Factorial of " + number + " is: " + factorial);
		System.out.println(calculateFactorial(number));

		s.close();
	}

	// using recursion approach
	private static int calculateFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);
		}
	}

}
