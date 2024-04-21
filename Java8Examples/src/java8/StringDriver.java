package java8;

public class StringDriver {
	public static void main(String[] args) {
		String str1 = "Abc"; // Literal it will be created in SCP(String constant Pool)
		String str2 = "Abc";
		String str3 = new String("abc"); // new Object will be created in heap

		System.out.println(str1 == str2); // true bcz both objects references are stored in the SCP are
		System.out.println(str1 == str3); // false bcz str1 stored in SCP and str3 stored in Heap Memory both objects
											// references are different
		System.out.println(str1.equalsIgnoreCase(str3)); // equals method checks with the content
	}

}
