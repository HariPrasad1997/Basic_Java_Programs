package basicInterviewPrograms;

import java.util.Scanner;

public class FindGivenNumberIsNegativeOrPositive {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println(num + "  number is positive");
		} else if (num < 0) {
			System.out.println(num + "  number is negative");
		} else {
			System.out.println(num + "  number is zero");
		}

		scanner.close();
	}

}
