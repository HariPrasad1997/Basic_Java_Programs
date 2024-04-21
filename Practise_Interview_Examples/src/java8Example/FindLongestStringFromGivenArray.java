package java8Example;

import java.util.Arrays;

/**
 * Write a java program to find longest string from the given array
 * 
 * @author HariPrasad
 */

public class FindLongestStringFromGivenArray {
	public static void main(String[] args) {
		String[] inputStrings = { "Java", "Spring", "MicroServices", "WebServices", "Kafka", "RabbitMessageQueue" };
		String reduce = Arrays.stream(inputStrings)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("Longest String is: " + reduce);
	}

}
