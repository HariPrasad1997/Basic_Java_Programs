package wrapperClasses;

public class DemoWrapper1 {
	public static void main(String[] args) {
		// Auto-Boxing Process

		Integer i1 = 12;
		Float f1 = 13.25f;
		Boolean b1 = true;
		Character c1 = 'A';

		// Auto-unBoxing Process
		int i2 = i1.intValue();
		float f2 = f1.floatValue();
		boolean b2 = b1.booleanValue();
		char c2 = c1.charValue();

		System.out.println("Value of int i1: " + i2);
		System.out.println("Value of float f2: " + f2);
		System.out.println("Value of boolean b2: " + b2);
		System.out.println("Value of char c2: " + c2);
	}

}
