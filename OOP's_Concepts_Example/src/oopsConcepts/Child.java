package oopsConcepts;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("child method");
	}

	public static void m2() {
		System.out.println("child static m2 method");
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.m1();
		Parent.m2();
		Child.m2();
	}

}
