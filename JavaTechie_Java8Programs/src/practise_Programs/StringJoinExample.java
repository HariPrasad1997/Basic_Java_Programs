package practise_Programs;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample {
	public static void main(String[] args) {
		List<String> nums = Arrays.asList("22", "03", "2024");
		String join = String.join("/", nums);
		System.out.println(join);
	}

}
