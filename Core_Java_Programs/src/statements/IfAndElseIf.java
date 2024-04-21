package statements;

import java.util.Scanner;

public class IfAndElseIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = scanner.nextInt();
		if (number == 10) {
			System.out.println("a value is " + number);
		} else if (number == 5) {
			System.out.println("a value is " + number);
		} else if (number == 3) {
			System.out.println("a value is " + number);
		} else {
			System.out.println("a value is " + 0);
		}
	}

}
