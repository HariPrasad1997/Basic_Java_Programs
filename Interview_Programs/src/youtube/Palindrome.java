package youtube;

public class Palindrome {
	public static void main(String[] args) {
		String original = "malayalam";

//		Collections.reverse(Arrays.asList(original));
//		boolean builder = new StringBuilder(original).reverse().toString().equals(original);
//		System.out.println(builder + " is palindrome");

		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println(original + " is palindrome");
		} else {
			System.out.println(original + " is not palindrome");
		}

		if (isPalindrome(original)) {
			System.out.println(original + " is palindrome");
		} else {
			System.out.println(original + " is not palindrome");
		}

	}

	/*
	 * private static boolean isPalindrome(String s) { StringBuilder builder = new
	 * StringBuilder(s); boolean reverse = false; String string =
	 * builder.reverse().toString(); if (s.equals(string)) { reverse = true;
	 * System.out.println(s + " is a palindrome"); } else { System.out.println(s +
	 * " is not palindrome"); }
	 * 
	 * return reverse; }
	 */

	protected static boolean isPalindrome(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++) {
			if (s.charAt(i) != s.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
