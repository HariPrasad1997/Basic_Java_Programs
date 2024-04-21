package test;

public class Demo {
	public static void main(String[] args) {
		Integer a1 = 100;
		Integer a2 = 100;
		Integer a3 = 500;
		Integer a4 = 500; // -127  to 128

		if (a1 == a2) {
			System.out.println("a1 == a2");
		} else {
			System.out.println("a1 != a2");
		}
		if (a3 == a4) {
			System.out.println("a3 == a4");
		} else {
			System.out.println("a3 != a4");
		}
	}

}
