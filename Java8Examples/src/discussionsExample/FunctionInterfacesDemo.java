package discussionsExample;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfacesDemo {
//	implements Predicate<Integer>

	public static void main(String[] args) {

		// 1. Predicate demo
		Predicate<String> predicate = (a) -> a.equals("hari");
		System.out.println(predicate.test("harsha"));

		Predicate<Integer> predicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t.equals(10);
			}
		};
		System.out.println(predicate2.test(10));
//		FunctionInterfacesDemo demo = new FunctionInterfacesDemo();
//		System.out.println(demo.test(10));

		// Function demo
		Function<Integer, Double> function = (a) -> Math.pow(a, 2);
		System.out.println(function.apply(10));

		// Supplier demo
		Supplier<Double> supplier = () -> Math.pow(10, 3);
		System.out.println(supplier.get());

		// Consumer demo
		Consumer<Integer> consumer = (a) -> System.out.println(a * a);
		consumer.accept(10);

		Runnable runnable = () -> System.out.println("Run method");
		runnable.run();

		try {
			Callable<Double> callable = () -> Math.sqrt(25);
			System.out.println(callable.call());
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		Comparable<String> comparable = (a) -> a.compareTo("harsha");
		System.out.println(comparable.compareTo("prasad"));
	}

//	@Override
//	public boolean test(Integer t) {
//		return true;
//	}

}
