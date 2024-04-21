package basicInterviewPrograms;

import java.util.Scanner;

public class FindLargestAmongThreeNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = scanner.nextInt();
		System.out.println("Enter second number: ");
		int second = scanner.nextInt();
		System.out.println("Enter third number: ");
		int third = scanner.nextInt();

		if (first >= second && first >= third) {
			System.out.println(first + " is largest");
		} else if (second >= first && second >= third) {
			System.out.println(second + " is largest");
		} else {
			System.out.println(third + " is largest");
		}
		System.out.println();

		// Using inbuilt function
		double result = Math.max(first, Math.max(second, third));
		System.out.println(result);
		scanner.close();
	}

}
