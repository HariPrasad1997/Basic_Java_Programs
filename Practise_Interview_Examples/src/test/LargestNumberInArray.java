package test;

public class LargestNumberInArray {
	public static void main(String[] args) {
		int[] arr = {92, 1, 2, 3, 4, 56, 32, 76, 21, 65, 35,85 };
		int largestNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNum) {
				largestNum = arr[i];
			}
		}
		System.out.println("LargestNumber: " + largestNum);

	}

}
