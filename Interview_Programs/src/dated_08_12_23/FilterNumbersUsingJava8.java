package dated_08_12_23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersUsingJava8 {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,12,32,21,5,7,35,40);
		
		List<Integer> collect = numbers.stream().filter(x -> x > 20).collect(Collectors.toList());

		System.out.println("Numbers with greater than 20 : "+collect);
	}

}
