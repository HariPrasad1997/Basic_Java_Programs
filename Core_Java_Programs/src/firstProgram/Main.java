package firstProgram;
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
public class Main {
	private static void doPrint(Base b) {
		b.print();
	}
	public static void main(String[] args) {
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();
		doPrint(x);
		doPrint(y);
		doPrint(z);
	}

}
