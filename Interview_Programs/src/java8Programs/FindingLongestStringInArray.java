package java8Programs;

import java.util.Arrays;
import java.util.Comparator;

public class FindingLongestStringInArray {

	public static void main(String[] args) {
		String[] input = { "Harsha", "Madhu", "SudharshanReddy", "Obulesh", "Rangeshwar", "Kanna" };
		String string = Arrays.stream(input).max(Comparator.comparing(String::length)).get();
//		String longest = Arrays.stream(input).reduce((x, y) -> x.length() > y.length() ? x : y).get();
		System.out.println(string);
	}
}
