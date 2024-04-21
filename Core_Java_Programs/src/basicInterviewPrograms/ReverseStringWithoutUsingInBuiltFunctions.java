package basicInterviewPrograms;

public class ReverseStringWithoutUsingInBuiltFunctions {
	public static void main(String[] args) {
		String s = "Harsha";
		String reverse = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}
		System.out.println("Reversed String " + reverse);
	}

}
