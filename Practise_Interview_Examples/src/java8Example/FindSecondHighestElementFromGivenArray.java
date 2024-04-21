package java8Example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a java program to find second highest element from the given array and
 * also find second least element from the given array
 * 
 * input: { 2, 3, 7, 8, 0, 12, 36, 25, -1, -5 } output: 25
 * 
 * @author HariPrasad Kathi
 */

public class FindSecondHighestElementFromGivenArray {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 7, 8, 0, 12, 36, 25, -1, -5 };
		Integer collect = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("second highest element: " + collect);

		// find second least element from given array
		Integer collect2 = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
		System.out.println("second least element: " + collect2);
	}

}
