package oopsConcepts;

public class PolymorphismDemo {

	/**
	 * Method Overloading : add is the same method name but the parameters and
	 * return type is different and can be any number of parameters
	 */
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b, double c) {
		return a + b + c;
	}

	/**
	 * Method Overriding: Same method name and same method parameters types and same
	 * return type
	 */

	int subtraction(int a, int b) {
		return a - b;
	}

	class Shape {
		void draw() {
			System.out.println("Drawing a shape");
		}
	}

	class Circle extends Shape {
		@Override
		void draw() {
			System.out.println("Drawing a circle");
		}
	}

	public static void main(String[] args) {

		PolymorphismDemo shape = new PolymorphismDemo();
		System.out.println(shape.add(10, 20));

	}

}
