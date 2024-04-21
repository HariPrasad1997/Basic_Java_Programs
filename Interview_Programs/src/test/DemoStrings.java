package test;

public class DemoStrings {

	public static void main(String[] args) {

		String s1 = new String("sachin");
		String s2 = new String("sachin");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		String s3 = "apples";
		String s4 = "banana";

		int result = s3.compareTo(s4);

		if (result < 0) {
			System.out.println(s3 + " is lexicographically less than " + s4 + result);
		} else if (result == 0) {
			System.out.println(s3 + " is lexicographically equal to " + s4);
		} else {
			System.out.println(s3 + " is lexicographically greater than " + s4);
		}
	}

}
