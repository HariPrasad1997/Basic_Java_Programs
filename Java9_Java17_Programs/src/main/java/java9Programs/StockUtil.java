package main.java.java9Programs;

import java.util.Set;

public class StockUtil {

	private static Set<String> getStockSymbols() {

		/*
		 *  case: 1 // Set<String> stock = new HashSet<>(); // stock.add("Apple"); //
		 * stock.add("Orange"); // stock.add("Banana"); // return
		 * Collections.unmodifiableSet(stock);
		 * 
		 * // Instead of five lines of code we can modify it in single line // case: 2
		 * // return Collections.unmodifiableSet(new
		 * HashSet<>(Arrays.asList("Apple","Orange","Banana")));
		 */
		// case: 3
		return Set.of("Apple", "Orange", "Banana");
	}

	public static void main(String[] args) {
		System.out.println("Stock list : " + getStockSymbols());

	}

}
