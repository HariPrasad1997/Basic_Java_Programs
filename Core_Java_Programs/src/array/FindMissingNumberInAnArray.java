package array;

public class FindMissingNumberInAnArray {

	public static void main(String[] args) {
		// Program to find missing number in an array
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 }; // length with missing number is 9
		int sum = (9 * 10) / 2; // 45
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i]; // 40 / sum of all elements in an array
		}

		System.out.println("Missing Number is :" + (sum - arrSum));
	}

}
