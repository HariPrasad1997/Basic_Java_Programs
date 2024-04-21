package programs_Java8;

import java.util.Arrays;
import java.util.List;

/**
 * Program to append - in between the strings objects
 * 
 * @author HariPrasad
 */

public class StringJoinMethodDemo {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("1", "2", "3", "4", "5");
		String join = String.join("-", asList);
		System.out.println(join);
	}

}
