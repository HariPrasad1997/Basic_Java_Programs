package test;

public class FindMaximumNumberInAnArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 12, 87, 30, 0 };
		int[] minMax = findMaximum(arr);
		
		System.out.println("Minimum Number: "+minMax[0]);
		System.out.println("Maximum Number: "+minMax[1]);
	}

	private static int[] findMaximum(int[] num) {
		int max = num[0];
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < max) {
				max = num[i];
			}
			if (num[i] > min) {
				min = num[i];
			}
		}
		return new int[] { max, min };
	}
}
