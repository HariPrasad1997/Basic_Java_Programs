package java8Features;

interface Calculator {
//	void switchOn(); // abstract method

//	void add(int input);

	int subtract(int i1, int i2);
}

public class CalculatorImpl {
	public static void main(String[] args) {
//		Calculator calculator = () -> System.out.println("Switch on");
//		calculator.switchOn();

		/*
		 * Calculator calculator = (a) -> System.out.println("Value of a: " + a);
		 * calculator.add(10);
		 */

		Calculator calculator = (a, b) -> {
			if (a < b) {
				throw new RuntimeException("a value should be more than b");
			} else {
				return a - b;
			}
		};
		System.out.println(calculator.subtract(15, 10));

	}

}
