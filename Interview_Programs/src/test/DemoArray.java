package test;

public class DemoArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 5;

		int count = countSubArrayWithSum(arr, sum);
		System.out.println("Number of subarrays with sum " + sum + ": " + count);

	}

	private static int countSubArrayWithSum(int[] arr, int sum) {
		int count = 0;

		for (int start = 0; start < arr.length; start++) {

			int currentSum = 0;

			for (int end = start; end < arr.length; end++) {
				currentSum = currentSum + arr[end];
				if (currentSum == sum)
					count++;
				printSubarray(arr, start, end);
				System.out.println("Subarray with sum " + sum + ": " + "Start Index: " + start + ", End Index: " + end);
			}
		}
		return count;

	}

	private static void printSubarray(int[] array, int start, int end) {
		System.out.print("Subarray with sum 5: [");
		for (int i = start; i <= end; i++) {
			System.out.print(array[i]);
			if (i < end) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}