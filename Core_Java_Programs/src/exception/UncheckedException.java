package exception;

/**
 * 
 * @author hkathi date: 03/04/2024
 *
 */
public class UncheckedException {
	public static void main(String[] args) {

		/*
		 * These are not checked at compile time this exceptions occurs at run time do
		 * not need to declared in a methods' throws clause
		 */

		try {
			int[] arr = { 1, 2, 3 }; // it has length 3 and only two indexes which start with 0,1,2
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Array Index out of bounds Exception: " + e);
		}

		try {
			int a = 0;
			int b = 10 / a;
			System.out.println(b);
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception: " + e);
			e.printStackTrace();
		}

	}

}
