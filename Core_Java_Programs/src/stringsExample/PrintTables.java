package stringsExample;

public class PrintTables {
	public static void main(String[] args) {

		// Iterate from 2 to 20
		for (int i = 1; i <= 20; i++) {
			// Print the table header
			System.out.println("Table of : " + i);

			// Print the body

			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "  *  " + j + "  =  " + (i * j));
			}

			// Print a separate

			System.out.println("--------------");
		}

		int x = 5;
		x = x * 10;
		System.out.println(x);
		System.out.println("---------");
		
		byte y = 127;
		y++;
		y++;
		System.out.println(y);
		
		if(1+1+1+1+1 == 5) {
			System.out.println(Boolean.TRUE);
		} else {
			System.out.println(Boolean.FALSE);
		}
		
		int k = 5;
		k *= (3 + 7);
		System.out.println(k);
	}

}
