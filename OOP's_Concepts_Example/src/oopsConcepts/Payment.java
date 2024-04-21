package oopsConcepts;

public interface Payment {

	public void doTransaction();

	/*
	 * Ignore if you don't want to add my addCoupon feature in any of your
	 * implementation classes directly access from super classes , if you want to
	 * use same implementation add @Override addCoupon method if you want to provide
	 * different implementation you can add it
	 */
	default void addCoupon() {
		System.out.println("add 5 Rs/ cashback");
	}

	static void generateTransactionReport() {
		System.out.println("static method");
	}

}
