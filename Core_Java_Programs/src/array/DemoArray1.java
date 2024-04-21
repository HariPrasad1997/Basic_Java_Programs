package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class DemoArray1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try (s;) {
			try {
				System.out.println("Enter the number of Integer Elements: ");
				int n = s.nextInt();
				Integer a[] = new Integer[n];
				System.out.println("Please Enter " + n + " Integer Elements: ");

				for (int i = 0; i < a.length; i++) {
					a[i] = s.nextInt();
				}

				System.out.println("====Display Using old for loop====");
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i] + " ");
				}

				System.out.println("\n====Display using Extended For loop====");
				for (Integer k : a) {
					System.out.print(k.toString() + " ");
				}

				System.out.println("\n=====Display using Java8 for loop======");
				Spliterator<Integer> sp = Arrays.spliterator(a);
				sp.forEachRemaining((k) -> {
					System.out.print(k + " ");
				});

			} catch (Exception e) {
				e.printStackTrace();
			}

		} // end of try with resource
	}

}
