package functionInterface;

@FunctionalInterface
interface Interface {
	void myMethod(int a, int b);
	
	public static final String a = "Hello";

	static String staticMethod() {
		return "Welcome to Java!..";
	}

	default void defaultMethod() {
		System.out.println("I am in default method..");
	}

}

public class MyFunctionalInterface {
	public static void main(String[] args) {
		Interface interface1 = (a, b) -> System.out.println(a + b);
		interface1.myMethod(10, 30);
		System.out.println(Interface.staticMethod());
		interface1.defaultMethod();
		System.out.println(Interface.a);

	}

}
