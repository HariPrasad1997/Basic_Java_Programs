package test;

class Base {
	public void print() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void print() {
		System.out.println("Derived");
	}
}

public class ExampleDemo {
	public static void doPrint(Base o) {
		o.print();
	}

	public static void main(String[] args) {
		Base b = new Base();
		Base x = new Derived();
		Derived y = new Derived();
		doPrint(b); // Base
		doPrint(x); // Derived
		doPrint(y); // Derived

	}

}
