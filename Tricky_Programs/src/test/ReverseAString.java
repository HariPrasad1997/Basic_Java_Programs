package test;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Harsha";
		StringBuilder builder = new StringBuilder(s);
		builder.reverse();
		System.out.println(builder);

	}

}
