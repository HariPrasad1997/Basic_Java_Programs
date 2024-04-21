package test;

public class Palindrome {
	public static void main(String[] args) {
		String s = "malayalam";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		String reversed = new StringBuilder(s).reverse().toString();
		return s.equals(reversed);
	}

}
