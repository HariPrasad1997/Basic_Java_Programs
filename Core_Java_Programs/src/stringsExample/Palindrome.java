package stringsExample;

public class Palindrome {
	public static void main(String[] args) {
		String s = "Malayalam";
//		System.out.println(isPalindrome(s));
		System.out.println(reversed(s));
	}

//	private static String isPalindrome(String s) {
//		return new StringBuilder(s).reverse().toString();
//
//	}

	private static boolean reversed(String s) {
		String reversed = new StringBuilder(s).reverse().toString();
		return reversed.equalsIgnoreCase(s);
	}
}
