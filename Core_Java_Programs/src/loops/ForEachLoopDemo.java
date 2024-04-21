package loops;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Set<Integer> set = new LinkedHashSet<>(list);
		Queue<Integer> integers = new PriorityQueue<>(list);
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);

		// Iterating collection of list elements
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Iterating array of elements
		for (Integer num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		// Iterating set of elements
		for (Integer num : set) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Iterating queue of elements
		for (Integer num : integers) {
			System.out.print(num + " ");
		}
		System.out.println();
		// Iterating map of elements
		for (Map.Entry<Integer, Integer> num : map.entrySet()) {
			System.out.println("Key: " + num.getKey() + " " + "Value: " + num.getValue());
		}

		for (int i = 1; i < map.size(); i++) {
			map.put(i, map.get(i));
		}
		System.out.print(map + " ");
	}

}
