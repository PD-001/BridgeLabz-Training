package libraryandbooks;

import java.util.ArrayList;

public class Library {

	//attribute to store books
	ArrayList<Book> books;

	//constructor
	Library() {
		books= new ArrayList<Book>();
	}

	//method to add book to library
	public void addBook(Book book) {
		books.add(book);
	}

	//method to display library books
	public void displayLibraryBooks() {
		for(int i=0; i < books.size(); i++) {
			books.get(i).displayBook();
			System.out.println();
		}
	}

	public static void main(String[] args) {

		//creating book objects (independent of library)
		Book book1= new Book("1984", "George Orwell");
		Book book2= new Book("The Metamorphosis", "Franz Kafka");

		// creating library objects
		Library library1= new Library();
		Library library2= new Library();

		// adding books to libraries
		library1.addBook(book1);
		library1.addBook(book2);

		library2.addBook(book2);

		// displaying library books
		System.out.println("Library 1 Books:");
		library1.displayLibraryBooks();

		System.out.println("Library 2 Books:");
		library2.displayLibraryBooks();
	}
}
