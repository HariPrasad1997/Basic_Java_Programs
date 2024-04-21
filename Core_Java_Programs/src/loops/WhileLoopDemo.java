package loops;

public class WhileLoopDemo {
	public static void main(String[] args) {

		// print from 10 to 1
		int i = 10;
		while (i >= 0) {
			System.out.print(i + " ");
			i--;
			continue;

		}
		System.out.println();
		// print from 1 to 10
		int j = 0;
		while (j <= 10) {
			System.out.print(j + " ");
			j++;
			continue;
		}
	}

}
