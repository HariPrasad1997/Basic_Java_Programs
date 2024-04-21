package testJava;

public class FinalAndFinalizeAndFinally {

	public static final int VARIABLE = 30;
//	int const = 40;

	public static void main(String[] args) {
//		VARIABLE = 50;
		FinalAndFinalizeAndFinally andFinally = new FinalAndFinalizeAndFinally();
		int value = FinalAndFinalizeAndFinally.VARIABLE;
		System.out.println(andFinally.VARIABLE);
		System.out.println(andFinally.test(10));

	}

	private final Integer test(Integer test) {
		return test;

	}
}