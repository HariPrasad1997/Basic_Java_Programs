package basicInterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 4, 5, 8, 1));
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set);
	}

}
