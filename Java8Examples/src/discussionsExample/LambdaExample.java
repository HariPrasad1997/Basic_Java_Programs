package discussionsExample;

// optional
interface Demo {
	void m1(int a, int b);
//	void m2();

	default int add(int a, int b) {
		return a + b;
	}

	static String show(String msg) {
		return "Hello Harsha";
	}

}

public class LambdaExample {
	public static void main(String[] args) {

		Demo demo = (a, b) -> System.out.println("Hello Nagarju!..  " + (a + b));
		demo.m1(10, 20);
		System.out.println(demo.add(20, 30));
		System.out.println(Demo.show("Hello Nagaraju"));
	}

//	@Override
//	public void m1() {
//		System.out.println("Without lambda Expression");
//
//	}

}
