package packages.classes;
import java.util.ArrayList;

public class Library {
	private static ArrayList<Book2> books;
	
	public Library() {
		this.books = new ArrayList<Book2>();
	}
	
	public void addBook(Book2 newBook) {
		this.books.add(newBook);
	}
	
	public static void printBooks() {
		for (Book2 book : books) {
			System.out.println(book);
		}
	}
	
	 public static ArrayList<Book2> searchByTitle(String title) {
		 ArrayList<Book2> found = new ArrayList<Book2>();

	     for (Book2 book : books) {
			if (StringUtils.included(book.title(), title)) found.add(book);
		}

	     return found;
	 }
	 public static ArrayList<Book2> searchByPublisher(String publisher)	{
		 ArrayList<Book2> found = new ArrayList<Book2>();

	     for (Book2 book : books) {
			if (StringUtils.included(book.publisher(), publisher)) found.add(book);
		}

	     return found;
	 }
	 public static ArrayList<Book2> searchByYear(int year)	{
		 ArrayList<Book2> found = new ArrayList<Book2>();

	     for (Book2 book : books) {
			if (book.year() == year) found.add(book);
		}

	     return found;
	 }
}
