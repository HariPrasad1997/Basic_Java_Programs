package discussionsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonImpl {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Hari", 26), new Person("Shiva", 24),
				new Person("Harsha", 28), new Person("Kanna", 25)));

		// Sort the list of Person objects using Collections.sort() method
		Collections.sort(persons);
//		System.out.println(persons);

		System.out.println("Sorted list of people by age:");
		for (Person person : persons) {
			System.out.println(person);
		}

		System.out.println();
		// Descending Order
		Collections.sort(persons, Comparator.reverseOrder());
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
