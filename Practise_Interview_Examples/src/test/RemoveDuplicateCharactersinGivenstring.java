package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersinGivenstring {
	public static void main(String[] args) {
		String s = "HariPrasad";
		System.out.println(removeDuplicates(s));
		removeSpecifElement(s, 'a');
	}

	private static String removeDuplicates(String s) {
		Set<Character> set = new LinkedHashSet<>();
		StringBuffer buffer = new StringBuffer();

		for (char ch : s.toCharArray()) {
			if (!set.contains(ch)) {
				set.add(ch);
				buffer.append(ch);
			}
		}
		return buffer.toString();
	}

	private static void removeSpecifElement(String s, char c) {
		String finalString = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				finalString = finalString + s.charAt(i);
			}
		}
		System.out.println(finalString);
	}

}
