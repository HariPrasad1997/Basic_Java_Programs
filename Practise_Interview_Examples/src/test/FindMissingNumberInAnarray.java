package test;

public class FindMissingNumberInAnarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int sum = (9 * 10) / 2;
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
		}
		System.out.println("Missing Number: " + (sum - arrSum));
	}

}
