package test;

public class FindNumberOfDigitsInNumber {
	public static void main(String[] args) {
		int n = 123456;
		String string = Integer.toString(n);
		System.out.println(string.length());

		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}

}
