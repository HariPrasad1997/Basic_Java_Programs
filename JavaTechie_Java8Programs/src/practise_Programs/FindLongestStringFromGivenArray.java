package practise_Programs;

import java.util.Arrays;

/**
 * Java program to find longest string from given string array
 * 
 * @author hkathi
 */

public class FindLongestStringFromGivenArray {
	public static void main(String[] args) {
		String[] names = { "Java", "SpringBoot", "Spring", "Microservices", "WebServices" };
		String longestString = Arrays.stream(names)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("longest String is: " + longestString);
	}

}
