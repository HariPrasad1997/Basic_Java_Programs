package test;

public class ConvertFirstLetterAsUpperCaseandremainingAsLower {
	public static void main(String[] args) {
		String s = "Hello world";
		int mid = s.length() / 2;

		String lowerCase = "";
		String upperCase = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < mid) {
				lowerCase = lowerCase + Character.toLowerCase(s.charAt(i));
			} else {
				upperCase = upperCase + Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(lowerCase + upperCase);
	}

}
