package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDao {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>(Arrays.asList(new Book(1, "Java", 350), new Book(1, "Spring", 250),
				new Book(1, "Hibernate", 180), new Book(1, "Microservices", 300), new Book(1, "Webservices", 280)));
		return books;
	}

}
