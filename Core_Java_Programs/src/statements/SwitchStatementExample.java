package statements;

import java.util.Scanner;

public class SwitchStatementExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number ");
		int number = scan.nextInt();

		switch (number) {
		case 1:
			number = 10;
			System.out.println(number);
			break;
		case 2:
			number = 20;
			System.out.println(number);
			break;
		case 3:
			number = 30;
			System.out.println(number);
			break;
		default:
			System.out.println(number);
		}
		scan.close();
	}

}
