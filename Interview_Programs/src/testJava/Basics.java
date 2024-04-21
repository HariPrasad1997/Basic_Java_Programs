package testJava;

public class Basics {
	public static void main(String[] args) {
		byte x = 127;
		x++;
		x++;
		System.out.print(x);

		char[] ch = new char[5];
		System.out.println(ch);

		int[] y = { 120, 200, 016 };
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		int[] A = { 0, 2, 4, 1, 3 };
		for (int i = 0; i < A.length; i++) {
			A[i] = A[(A[i] + 3) % A.length];
//			System.out.println(A[1]);
		}

		System.out.println();
		String str = "Hellow";
		System.out.println(str.indexOf('t'));

		System.out.println();
		String str1 = "Interviewbit".replace('e', 's');
		System.out.println(str1);

		System.out.println();
		String a = new String("Interviewbit");
		String b = new String("Interviewbit");
		String c = "Interviewbit";
		String d = "Interviewbit";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

		int a1 = 100;
		System.out.println(++a1);

		if (1 + 1 + 1 + 1 + 1 == 5) {
			System.out.print("TRUE");
		} else {
			System.out.print("FALSE");
		}

		System.out.println();
		int x1 = 5;
		x1 *= (3 + 7);
		System.out.println(x1);

		var floor = Math.floor(3.6);
		System.out.println(floor);

		System.out.println();
		int i;
		for (i = 1; i < 6; i++) {
			if (i > 3)
				continue;
		}
		System.out.println(i);

		int count = 0;
		do {
			System.out.println("Interviewbit");
			count++;
		} while (count < 10);

		int d1 = 10 / 0;
		System.out.println(d1);

	}

}
