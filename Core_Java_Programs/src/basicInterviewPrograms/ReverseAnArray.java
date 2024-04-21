package basicInterviewPrograms;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 }; // 7
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			// swap the elements
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		// print the reversed array
		for (Integer arr : array) {
			System.out.print(arr + " ");
		}
	}

}
