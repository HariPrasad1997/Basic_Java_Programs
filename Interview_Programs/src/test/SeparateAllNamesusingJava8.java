package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateAllNamesusingJava8 {
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("India", "Usa", "Canada", "Japan", "France", "Italy", "Germany");
		String collect = countries.stream().map(con -> con.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(collect);

	}

}
