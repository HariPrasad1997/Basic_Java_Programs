package oopsConcepts.fundamentals;

public class Demo {

	private final int a = 10;

	public void m1() {
		try {
//			a = 20; // cannot reassigned the final varaibles
			System.out.println("try block");

		} catch (Exception e) {
			System.out.println("Exception : " + e);

		} finally {
			System.out.println("finally block");
			// to clean the connection like JDBC and streams
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called..");
	}

	public static void main(String[] args) throws Throwable {

		Demo demo = new Demo();
		demo.m1();
		demo = null;
		System.gc();

	}

}