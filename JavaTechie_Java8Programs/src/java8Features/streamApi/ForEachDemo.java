package java8Features.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("Hari", "Chinna", "Raju", "Krishna"));
		names.forEach(result -> {
			System.out.println(result + " ");
		});

		// filter demo --> used for conditional checks
		String nameStartWith_H = names.stream().filter(elements -> elements.startsWith("H")).findFirst()
				.orElseGet(() -> null);
		System.out.println("Name prefix filtering" + nameStartWith_H);

		// old for each loop
		/*
		 * for(String s: names) { System.out.println(s); }
		 */

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Hari");
		map.put(2, "Harsha");
		map.put(3, "Chinna");
		map.put(4, "Kanna");
		map.put(5, "Madhu");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		map.entrySet().stream().filter(key -> key.getKey() % 2 == 0).forEach(result -> System.out.println(result));

		map.entrySet().stream().forEach(System.out::println);
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
