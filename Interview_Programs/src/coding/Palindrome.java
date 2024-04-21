package coding;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String original = scanner.nextLine();

		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(original + " is a palindrome");
		} else {
			System.out.println(original + " is not palindrome");
		}
		scanner.close();
		isPalindrome(original);
	}

	private static void isPalindrome(String s) {
		StringBuilder builder = new StringBuilder(s);
		String string = builder.reverse().toString();
		if (s.equals(string)) {
			System.out.println(s + " is a Palindrome");
		} else {
			System.out.println(s + " is not Palindrome");
		}
	}

}
