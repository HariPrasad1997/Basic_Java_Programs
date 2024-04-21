package java8Features.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
//implements Predicate<Integer> {

	// approach : 1
	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) {
	 * System.out.println(t + " is a Even Number"); return true; } else {
	 * System.out.println(t + " is not a event Number"); return false; } }
	 */

	public static void main(String[] args) {
//		System.out.println(new PredicateDemo().test(10));

		// using anonymous innerclass
		/*
		 * Predicate<Integer> predicate = new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
		 * else { return false; }
		 * 
		 * } };
		 * 
		 * System.out.println(predicate.test(3));
		 */

		// using lambda expression
//		Predicate<Integer> predicate = (a) -> a % 2 == 0;
//		System.out.println(predicate.test(5));

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> even = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
	}

}
