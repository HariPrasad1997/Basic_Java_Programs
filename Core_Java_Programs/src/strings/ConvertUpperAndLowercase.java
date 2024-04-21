package strings;

public class ConvertUpperAndLowercase {
	public static void main(String[] args) {
		String input = "Hello world Hello World";
		System.out.println(input.length()); // 23
		int mid = input.length() / 2; // 11

		String lowerCase = "";
		String upperCase = "";

		for (int i = 0; i < input.length(); i++) {
			if (i < mid) {
				lowerCase = lowerCase + Character.toLowerCase(input.charAt(i));
			} else {
				upperCase = upperCase + Character.toUpperCase(input.charAt(i));
			}
		}

		System.out.println(lowerCase + " " + upperCase);
	}

}
