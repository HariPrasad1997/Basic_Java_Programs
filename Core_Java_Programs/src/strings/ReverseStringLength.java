package strings;

/**
 * Write a program to find the revserse of the wods present in the Stringss
 * 
 * @author hkathi
 *
 */
public class ReverseStringLength {
	public static void main(String[] args) {

		String str = "I Love My India";

		String[] arr = str.split("");
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		System.out.println(result);
	}

}
