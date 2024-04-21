package insta_Programs;

public class Main {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 12; i += 2) {
			if (i == 8) {
				System.out.println(i);
				break;
			}
		}
	}
	/*
	 * It executes successfullt but it print nothing.. intially i=1 and conditions
	 * is it increment by 2 so, 1 + 2 = 3; 3 + 2 = 5; 5 + 2 = 7; 7 + 2 = 9; 9 + 2 =
	 * 11; So it never be 8 so it's printing nothing
	 */

}
