package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {

		try { // checked exception handle: Compiler forces to handle it
			FileReader fileReader = new FileReader("activityDB.png");
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Caught File not found Exception: " + e);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// un-checked exception example
		try {
			int numerator = 10;
			int denominator = 0;
			int result = numerator / denominator;
			if (denominator > 0) {
				System.out.println(result);
			}
		} catch (ArithmeticException e) {
			System.out.println("Caught unchecked exception: " + e);
		}
	}

}
