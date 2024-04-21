package functionInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {
	public static void main(String[] args) {

		// Predicate demos
		Predicate<String> predicate = (a) -> a.equals("Harsha");
		System.out.println(predicate.test("hari"));

		// Fucntion demo // squaring the number
		Function<Integer, Double> function = (a) -> Math.pow(a, 2);
		System.out.println(function.apply(12));

		Supplier<String> supplier = () -> "Harsha";
		System.out.println(supplier.get());

		Consumer<Integer> consumer = (a) -> System.out.println(a);
		consumer.accept(10);
		
		

	}
}
