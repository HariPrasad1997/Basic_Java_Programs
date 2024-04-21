package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveOccuranceOfCharacters {
	public static void main(String[] args) {
		String s = "CloudTeCh"; // remove c's from given string
		System.out.println(s.replaceAll("C", ""));
		System.out.println(removeCharacters(s));
		removeAlloccuranceCharacters(s, 'C');
	}

	private static String removeCharacters(String s) {
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

	private static void removeAlloccuranceCharacters(String s, char c) {
		int n = s.length();
		String finalString = "";
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != c) {
				finalString = finalString + s.charAt(i);
			}
		}
		System.out.println(finalString);
	}

}
