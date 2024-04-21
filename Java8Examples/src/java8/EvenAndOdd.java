package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,21,32,78,30);
		List<Integer> collect = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers: "+collect);
		char ch = 75;
		char ch1 = '\0';
		Character c = 65;
		System.out.println(ch);
		System.out.println(ch1);
	}

}
