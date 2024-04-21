package youtube;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromGivenString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // here character 'a' is duplicate we need to delete second repeated
		System.out.println("Enter a name:");
		String name = scanner.nextLine();
		System.out.println(removeDuplicates(name));
		scanner.close();

	}

	/*
	 * private static String removeDuplicates(String s) { Set<Character> set = new
	 * HashSet<>(); StringBuffer buffer = new StringBuffer();
	 * 
	 * for (int i = 0; i < s.length(); i++) { Character ch = s.charAt(i); if
	 * (!set.contains(ch)) { set.add(ch); buffer.append(ch); } }
	 * 
	 * return buffer.toString(); }
	 */

	// Using java-8 approach

//	private static String removeDuplicates(String s) {
//		return s.chars().distinct().mapToObj(Character::toString).collect(Collectors.joining());
//	}

	private static String removeDuplicates(String s) {
		return s.chars().mapToObj(Character::toString).distinct().map(String::valueOf).collect(Collectors.joining());
	}
	// Alternative way in java approach
	/*
	 * private static String removeDuplicates(String s) { Set<Character> set = new
	 * HashSet<>(); StringBuilder builder = new StringBuilder();
	 * 
	 * for (char c : s.toCharArray()) { if (set.add(c)) { // if character is added
	 * to set it is unique builder.append(c); } } return builder.toString(); }
	 */

}
