package basicInterviewPrograms;

import java.util.Scanner;

public class FindVowelOrConsonant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a single alphabet: ");
		char alphabet = scanner.next().charAt(0);

		// check for vowel or consonant
		boolean isVowel = false;
		switch (alphabet) {
		case 'a':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'A':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'e':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'E':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'i':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'I':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'o':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'O':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'u':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		case 'U':
			isVowel = true;
			System.out.println(alphabet + " is Vowel");
			break;
		default:
			System.out.println(alphabet + " is consonant");
		}
	}

}
