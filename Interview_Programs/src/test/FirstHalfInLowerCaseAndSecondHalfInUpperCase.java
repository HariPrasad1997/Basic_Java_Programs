package test;

public class FirstHalfInLowerCaseAndSecondHalfInUpperCase {

	public static void main(String[] args) {

		String str = "This is Java Program This is Java Program";
		int midValue = str.length() / 2;
		String lowerCase = "";
		String upperCase = "";
		// Case : 2
		/*
		 * for (int i = 0; i < str.length(); i++) { if (i < midValue) { lowerCase =
		 * lowerCase + Character.toLowerCase(str.charAt(i)); } else { upperCase =
		 * upperCase + Character.toUpperCase(str.charAt(i)); } }
		 * System.out.println(lowerCase + upperCase);
		 */

		// Case : 2
		String builder = str.chars().limit(midValue).mapToObj(Character::toLowerCase)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		builder += str.substring(midValue).toUpperCase();
		System.out.println(builder);
	}

}
