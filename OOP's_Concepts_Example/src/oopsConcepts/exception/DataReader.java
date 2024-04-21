package oopsConcepts.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	public static void main(String[] args) {
		File file = new File("/home/hkathi/Documents/photo.jpg");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while (reader.readLine() != null) {
				System.out.println(reader.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
