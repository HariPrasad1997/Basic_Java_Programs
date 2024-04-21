package test;

public class ReverseAString {
	public static void main(String[] args) {
		String s = "Hari";
		StringBuilder builder = new StringBuilder(s);
		builder.reverse();
		System.out.println(builder);
	}

}
