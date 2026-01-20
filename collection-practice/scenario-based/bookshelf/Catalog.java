package bookshelf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Catalog {

	private Map<String, List<Book>> catalog;

	public Catalog(List<Book> books) {

		catalog= new HashMap<>();

		for (Book b:books)
			catalog.computeIfAbsent(b.genre, k->new LinkedList<>()).add(b);
	}

	public void addBook(Book book) {

		if (book==null)
			return;

		catalog.computeIfAbsent(book.genre, k->new LinkedList<>()).add(book);
	}

	public Book searchBook(String bookName) {

		if (bookName==null)
			return null;

		for (List<Book> list: catalog.values()) {
			for (Book b: list) {
				if (b.bookName.equalsIgnoreCase(bookName))
					return b;
			}
		}
		return null;
	}

	public boolean deleteBook(String bookName) {

		if (bookName==null)
			return false;

		for (List<Book> list: catalog.values()) {
			for (int i= 0;i<list.size();i++) {
				if (list.get(i).bookName.equalsIgnoreCase(bookName)) {
					list.remove(i);
					return true;
				}
			}
		}
		return false;
	}
}
