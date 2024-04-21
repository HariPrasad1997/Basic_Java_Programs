package java8Example;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringFromGivenArray {
	public static void main(String[] args) {
		String[] names = { "Harsha", "Arjun", "RaviChandran", "SudheerBabu", "Ramanjaneyulu" };
		// Case : 1
		String reduce = Arrays.stream(names).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();

		// Case : 2
		String string = Arrays.stream(names).max(Comparator.comparing(String::length)).get();
		System.out.println("longest String:  " + string);
	}

}
