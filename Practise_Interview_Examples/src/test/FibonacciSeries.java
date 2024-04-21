package test;

public class FibonacciSeries {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next;

		System.out.println(first);
		System.out.println(second);

		for (int i = 0; i < 10; i++) {
			next = first + second; // next = 0 + 1 = 0, 1+1 = 2
			first = second; // 0 = 1
			second = next; // 1 = 2
			System.out.print(next+" ");
		}
	}

}
