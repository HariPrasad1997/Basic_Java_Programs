package basicInterviewPrograms;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		int a = 30;
		int b = 20;

		System.out.println("a is " + a + " and b is " + b);

		// swapping without third variable
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10
		a = a - b; // 30 - 10 = 20

		System.out.println("after swapping a is " + a + " and b is " + b);
	}

}
