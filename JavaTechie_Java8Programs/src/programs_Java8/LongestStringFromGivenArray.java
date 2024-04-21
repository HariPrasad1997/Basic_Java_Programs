package programs_Java8;

import java.util.Arrays;

/**
 * Program to find longest string from the given array of strings
 * 
 * @author HariPrasad
 */

public class LongestStringFromGivenArray {
	public static void main(String[] args) {
		String[] inputString = { "Java", "Spring", "SpringBoot", "Microservices", "Webservices" };
		String longestString = Arrays.stream(inputString).reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
		System.out.println(longestString);
	}

}
