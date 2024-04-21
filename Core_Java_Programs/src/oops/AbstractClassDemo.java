package oops;

import java.util.ArrayList;

abstract class Demo {
	public Demo() { // constructor
		System.out.println("Abstarct class constructor loaded");
	}

	int a = 10;
	static int b = 5;

	abstract void test();

	static int add(int a, int b) {
		return a + b;
	}

	int subtract(int a, int b, int c) {
		return a - b - c;
	}
}

abstract class Demo1 {
	int a = 5;
}

interface Test {

}

interface Test1 {

}

class InterfaceTest implements Test, Test1 {

}

public class AbstractClassDemo extends Demo {
	public static void main(String[] args) {
		Demo demo = new AbstractClassDemo();
		demo.test();
		System.out.println(demo.a);
		System.out.println(Demo.b);
		System.out.println(Demo.add(10, 20));
		System.out.println(demo.subtract(30, 20, 10));

	}

	@Override
	void test() {
		System.out.println("Test method implementation");

	}

}
