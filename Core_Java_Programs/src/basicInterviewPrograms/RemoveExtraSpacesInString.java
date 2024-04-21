package basicInterviewPrograms;

public class RemoveExtraSpacesInString {
	public static void main(String[] args) {
		String input = "one two three four";
		String replaceAll = input.replaceAll("\\s+", "");
		System.out.println(replaceAll);
	}

}
