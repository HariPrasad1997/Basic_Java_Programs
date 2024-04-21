package youtube;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonOccurenceCharactersFromGivenString {
	public static void main(String[] args) {
//		char c = firstNonRepeatCharacters("aabbccdef");
//		System.out.print(c + " ");

		String s = "ilovejavacoding"; // non-repeat : l,e,j,c,d,n,g

		Map<String, Long> occuranceOfEachElement = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(occuranceOfEachElement);

		List<String> nonRepeatElements = occuranceOfEachElement.entrySet().stream().filter(map -> map.getValue() == 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(nonRepeatElements);

		// find first repeated character from given string
		String firstRepeatedCharacter = occuranceOfEachElement.entrySet().stream().filter(map -> map.getValue() > 1)
				.map(Map.Entry::getKey).findFirst().get();
		System.out.println(firstRepeatedCharacter);

	}

//	private static char firstNonRepeatCharacters(String s) {
//		Map<Character, Integer> map = new LinkedHashMap<>(s.length());
//		for (char c : s.toCharArray()) {
//			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
//		}
//
//		for (Entry<Character, Integer> entry : map.entrySet()) {
//			if (entry.getValue() == 1) {
//				return entry.getKey();
//			}
//		}
//
//		throw new RuntimeException("Didn't find any non-repeat characters");
//	}

}
