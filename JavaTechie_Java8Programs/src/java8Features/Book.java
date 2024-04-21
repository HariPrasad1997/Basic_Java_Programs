package java8Features;

public class Book {

	private int id;
	private String name;
	private int pages;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPages() {
		return pages;
	}

	public Book(int id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}

}
