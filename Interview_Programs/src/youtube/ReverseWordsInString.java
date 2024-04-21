package youtube;

/**
 * Write a java program to reverse the each word of the given string
 * 
 * i/p: Welcome to java world
 * 
 * o/p: world java to Welcome
 * 
 * @author HariPrasad
 * 
 */

public class ReverseWordsInString {
	public static void main(String[] args) {

		String input = "Welcome to java world";
		String[] splitArray = input.split(" ");
		// Using java8 approach
		/*
		 * Collections.reverse(Arrays.asList(splitArray)); String reversedString =
		 * String.join(" ", splitArray);
		 */
		// Using Normal for loop
		for (int i = splitArray.length - 1; i >= 0; i--) {
			System.out.print(splitArray[i] + " ");
		}
//		System.out.println(reversedString);

	}

}
