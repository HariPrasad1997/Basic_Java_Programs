package coding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: "); // HariPrasad duplicates: a,r o/p: HariPsd

		String s = scanner.nextLine();
		System.out.println(removeDuplicates(s));
		scanner.close();

	}

	private static String removeDuplicates(String str) {

		Set<Character> set = new HashSet<>();

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				buffer.append(ch);
			} else {
				set.add(ch);
			}
		}

		return buffer.toString();

	}

}
