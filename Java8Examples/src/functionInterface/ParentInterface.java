package functionInterface;

@FunctionalInterface
public interface ParentInterface {
	void parentMethod();

}

interface ChildInterface extends ParentInterface {
	void childMethod();
}
