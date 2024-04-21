package firstProgram;

public class FindNumberOfDigitsPresent {
	public static void main(String[] args) {
		int n = 12345;
		String length = Integer.toString(n);
		System.out.println(length.length());

		// using loops approach
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10; // 1234 // 123 // 12 // 1 // 0
		}
		System.out.println(count);
	}

}
