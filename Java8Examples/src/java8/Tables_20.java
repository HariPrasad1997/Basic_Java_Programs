package java8;

public class Tables_20 {
	public static void main(String[] args) {
		int tablesUpto = 20;

		for (int i = 1; i <= tablesUpto; i++) {
			System.out.println("Table of " + i);

			for (int j = 1; j <=10; j++) {
				System.out.println(i + " * " + j+ " = " + (i * j));
			}
			System.out.println();
		}
	}

}
