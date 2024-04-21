package java8Features.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	// approach : 1
//implements Consumer<Integer> {

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Integer value is " + t);
//
//	}

	public static void main(String[] args) {

//		 approach: 2
		/*
		 * Consumer<Integer> consumer = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) {
		 * System.out.println("Integer value is: " + t);
		 * 
		 * } }; consumer.accept(20);
		 */

		// using java8 approach: 3
//		Consumer<Integer> consumer = (a) -> System.out.println("Integer value is: " + a);
//		consumer.accept(20);

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		integers.stream().forEach(consume -> System.out.print(consume + " "));
	}

}
