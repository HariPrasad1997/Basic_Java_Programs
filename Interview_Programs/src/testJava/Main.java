package testJava;

class A {
	public A() {
		System.out.println("Object is created");
	}

	@Override
	public void finalize() {
		System.out.println("finalize method called");
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			A a = new A();
			a = null;
			System.gc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally block executed..");
		}
//		a.finalize();
	}

}
