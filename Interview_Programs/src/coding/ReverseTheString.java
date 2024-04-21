package coding;

public class ReverseTheString {
	public static void main(String[] args) {
		String s = "Welcome to java world";
		StringBuilder builder = new StringBuilder(s);
		String reversed = builder.reverse().toString();
		System.out.print(reversed + " ");
		System.out.println();
		String[] split = s.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
	}

}
