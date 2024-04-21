package functionInterface;

public class ParentInterfaceImpl implements ChildInterface {
	public static void main(String[] args) {

		ChildInterface impl = new ParentInterfaceImpl();
		impl.parentMethod();
		impl.childMethod();

	}

	@Override
	public void parentMethod() {
		System.out.println("parent method");

	}

	@Override
	public void childMethod() {
		System.out.println("child method");

	}

}
