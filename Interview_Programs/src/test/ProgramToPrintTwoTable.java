package test;

public class ProgramToPrintTwoTable {
	public static void main(String[] args) {
		int i = 0;
		int tablesUpto = 20;
//		for (i = 0; i <= 10; i++) {
//			int result = 2 * i;
//			System.out.println("2 x " + i + " = " + result);
//		}

		for (i = 1; i <= tablesUpto; i++) {
			System.out.println(i + " Time table");

			for (int j = 1; j <= 10; j++) {
				int result = i * j;
				System.out.println(i + " x " + j + " = " + result);
			}
			System.out.println();
		}
	}

}
