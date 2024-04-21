package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * @author hkathi
 * 
 *         date: 03/04/2024
 *
 */
public class CheckedException {
	public static void main(String[] args) {

		/*
		 * these are checked at compile time, the progarammer muct handle this exception
		 * by using try catch or throws keyword
		 */

		try {
			FileInputStream fileReader = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found " + e);
		}
	}

}
