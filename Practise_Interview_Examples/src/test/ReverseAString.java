package test;

public class ReverseAString {

	public static void main(String[] args) {
		String input = "Hello";
		String reversed = reversedString(input);
		System.out.println("Reversed String: " + reversed);
	}

	private static String reversedString(String input) {
		return new StringBuilder(input).reverse().toString();
	}

}
