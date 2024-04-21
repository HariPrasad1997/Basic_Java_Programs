package strings;

public class Palindrome {

	public static void main(String[] args) {
		String input = "MOM";

		StringBuilder s1 = new StringBuilder(input);
		s1.reverse();
		String rev = s1.toString();
		if (rev.equals(input) == true) {
			System.out.println(input + " is Palindrome");
		} else {
			System.out.println(input + " is not palindrome");
		}
//		boolean IsPalindromic = isPalindrome(input);
//		System.out.println(IsPalindromic);
//
//	}
//
//	private static boolean isPalindrome(String input) {
//		String reversed = new StringBuffer(input).reverse().toString();
//		return input.equals(reversed);
//	}

	}

}
