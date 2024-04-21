package programs_Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Program to find the count of each element occurance from the String input:
 * "ilovemyindia" output: {a=1, d=1, e=1, v=1, y=1, i=3, l=1, m=1, n=1, o=1}
 * 
 * @author HariPrasad
 * 
 */

public class FindEachOccurancesOfCharacterInString {
	public static void main(String[] args) {

		String input = "Iwanttobecomeanjavadeveloper";
		Map<String, Long> collect = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

	}

}
