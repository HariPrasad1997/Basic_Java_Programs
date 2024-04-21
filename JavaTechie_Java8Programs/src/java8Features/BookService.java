package java8Features;

import java.util.Collections;
import java.util.List;

public class BookService {

	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}

	public List<Book> getBooksInSort() {
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));
		return books;
	}

}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) { return
 * o2.getName().compareTo(o1.getName()); }
 * 
 * }
 */