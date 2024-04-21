package test;

public class Palindrome {
	public static void main(String[] args) {
		String s = "Racecar";
		if (isPalindrome(s)) {
			System.out.println(s + " is Palindrome");
		} else {
			System.out.println(s + " is not Palindrome");
		}
	}

	private static boolean isPalindrome(String s) {
		String builder = new StringBuilder(s).reverse().toString(); // racecar
		String reversed = builder.toLowerCase().toString(); // racecar
		return s.toLowerCase().equals(reversed); // true
	}
}
