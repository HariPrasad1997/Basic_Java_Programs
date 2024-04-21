package youtube;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 10 which you want to remove: ");
		int elementToRemove = scanner.nextInt();
		// Using java 8 approach
//		int[] newArray = Arrays.stream(array).filter(ele -> ele != elementToRemove).toArray();
//		System.out.println(Arrays.toString(newArray));
		System.out.println("Original Array: " + Arrays.toString(array));
		int[] newArray = removeElement(array, elementToRemove);
		System.out.println("new Array: " + Arrays.toString(newArray));

		scanner.close();

	}

	// Using regular java for loop approach
	private static int[] removeElement(int[] arr, int elementToRemove) {
		int[] newArray = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != elementToRemove) {
				newArray[index] = arr[i];
				index++;
			}
		}

		return newArray;
	}

}
