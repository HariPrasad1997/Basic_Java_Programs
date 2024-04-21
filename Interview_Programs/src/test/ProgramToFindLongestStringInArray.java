package test;

import java.util.Arrays;
import java.util.Comparator;

public class ProgramToFindLongestStringInArray {
	public static void main(String[] args) {
		String[] string = { "Java", "Hibernate", "SpringBoot", "MicroServices" };

		/*
		 * Approach : 1 String string2 =
		 * Arrays.stream(string).max(Comparator.comparing(String::length)).get(); if
		 * (!string2.isEmpty()) { System.out.println(string2); } else {
		 * System.out.println("Not present"); }
		 */

//		Approach : 2

		String string3 = Arrays.stream(string).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		System.out.println(string3);
	}

}
