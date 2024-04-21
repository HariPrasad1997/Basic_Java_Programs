package java8Features.functionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {
//		Supplier<Integer> supplier = () -> 10;
//		System.out.println(supplier.get());

		List<String> integers = Arrays.asList("a", "b", "c", "d", "e");
		String orElseGet = integers.stream().findAny().orElseGet(() -> "Hari");
		System.out.println(orElseGet);

	}

}
