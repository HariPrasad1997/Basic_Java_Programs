package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(10);
		integers.add(10);
		integers.add(1, 20);
		integers.remove(1);
		integers.add(null);
		System.out.println(integers);

		List<String> list = new Stack<>();
		list.add("harsha");
		list.add(0, null);
		System.out.println(list.contains("harsha"));
		System.out.println(list);

		List<Double> doubles = new Vector<>();
		doubles.add(0, 10.0);
		System.out.println(doubles);
	}

}
