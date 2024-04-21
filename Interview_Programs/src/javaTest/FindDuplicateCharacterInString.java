package javaTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string here..");
		String str = scan.nextLine();
		FindDuplicates.duplicateCharacter(str);
		System.out.println(FindDuplicates.dupChars(str));
		scan.close();

	}

}

class FindDuplicates {
	/*
	 * public static void duplicateCharacter(String s) { Map<Character, Integer> map
	 * = new HashMap<>(); char[] ch = s.toCharArray(); System.out.println(ch); for
	 * (char c : ch) { if (map.containsKey(c)) { map.put(c, map.get(c) + 1); } else
	 * { map.put(c, 1); } } Set<Character> set = map.keySet(); for (char ch1 : set)
	 * { if (map.get(ch1) > 1) { System.out.println(ch1 + " is : " + map.get(ch1) +
	 * " times"); } } }
	 */

	public static void duplicateCharacter(String string) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] cs = string.toCharArray();

		for (char ch : cs) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> set = map.keySet();
		for (char ch1 : set) {
			if (map.get(ch1) > 1) {
				System.out.println(ch1 + "  is: " + map.get(ch1) + " times");
			}
		}
	}

	public static Map<String, Long> dupChars(String s) {
		return Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	}
}
