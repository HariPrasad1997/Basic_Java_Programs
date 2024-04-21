package java8Example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a java program to find the each element occurance means count from the
 * given input String input: "ilovemyparents" output: {p=1, a=1, r=1, s=1, t=1,
 * e=2, v=1, y=1, i=1, l=1, m=1, n=1, o=1}
 * 
 * @author HariPrasad
 */

public class FindEachElementOccuranceFromGivenString {
	public static void main(String[] args) {
		String input = "ilovemyparents";
		Map<String, Long> collect = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

}
