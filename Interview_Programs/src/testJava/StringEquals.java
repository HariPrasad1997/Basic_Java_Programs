package testJava;

public class StringEquals {
	public static void main(String[] args) {
		String s1 = new String("Java");

		String s2 = new String("Java");

		String s3 = "Java";

		if (s1.equals(s2)) {
			System.out.println("Both are equal");
		} else if (s2.equals(s3)) {
			System.out.println(s2 + " " + s3 + " Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
