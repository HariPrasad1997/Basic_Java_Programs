package test;

public class FindSumOfGivenNumbers {
	public static void main(String[] args) {
		int n = 12345;
		int sum = 0;
		int k = n;
		while (k > 0) {
			int r = k % 10; // 5 +4+3+2+1 = 15
			sum = sum + r;
			k = k / 10; // 1234
		}
		System.out.println("sum: " + sum);
	}

}
