package testJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class B implements Comparable<B> {

	@Override
	public int compareTo(B o) {
		return 10;
	}

}

public class ComparatorAndComparable {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 2, 4, 5, 6, 7, 1);
		Collections.sort(nums);
		System.out.println(nums);
		Collections.sort(nums, Comparator.reverseOrder());
		System.out.println(nums);

		List<B> blist = new ArrayList<>();
		blist.add(new B());
		blist.add(new B());
		blist.add(new B());

		Collections.sort(blist);
		System.out.println(blist);
		B b = new B();
		System.out.println(b.compareTo(b));
	}

}
