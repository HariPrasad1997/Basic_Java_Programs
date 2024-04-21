package firstProgram;

public class ArrayExample {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println(numbers.length);

	}

}
