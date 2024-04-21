package test;

/**
 * Write a Program to check weather given string is palindrome or not
 * 
 * @author hkathi
 *
 */
public class CheckingGivenStringIsPalindromeOrNot {

	public static void main(String[] args) {
		String input = "Malayalam";
		boolean isPalindromic = isPalindrome(input);
		System.out.println(isPalindromic);

	}

	private static boolean isPalindrome(String input) {
		String reversed = new StringBuilder(input).reverse().toString();
		return input.equalsIgnoreCase(reversed);
	}

}
