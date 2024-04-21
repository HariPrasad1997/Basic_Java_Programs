package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 5);
		map.put("c", 15);
		LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted((e1, e2) -> {
			return e1.getValue() - e2.getValue();

		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(collect);
	}

}
