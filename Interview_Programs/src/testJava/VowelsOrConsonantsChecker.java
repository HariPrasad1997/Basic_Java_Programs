package testJava;

import java.util.Scanner;

public class VowelsOrConsonantsChecker {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a single alphabet");

		char alphabet = scanner.next().charAt(0);

//		if (alphabet > 1) {
//			return;
//		}

		boolean isVowel = false;

		if (alphabet == 'a' || alphabet == 'A' || alphabet == 'e' || alphabet == 'E' || alphabet == 'i'
				|| alphabet == 'I' || alphabet == 'o' || alphabet == 'O' || alphabet == 'u' || alphabet == 'U') {
			isVowel = true;
		}

		if (isVowel) {
			System.out.println(alphabet + "  is a vowel");
		} else {
			System.out.println(alphabet + " is a consonant");
		}

		scanner.close();
	}

}
