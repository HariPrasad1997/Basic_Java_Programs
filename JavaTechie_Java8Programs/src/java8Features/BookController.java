package java8Features;

import java.util.List;

public class BookController {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		List<Book> books = bookService.getBooksInSort();
		System.out.println(books);
	}

}
