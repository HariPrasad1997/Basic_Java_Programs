package java8Example;

public class StringJoinExample {
	public static void main(String[] args) {
		String[] numbers = { "2", "3", "12", "10", "15" };
		String join = String.join("-", numbers);
		System.out.println(join);
	}

}
