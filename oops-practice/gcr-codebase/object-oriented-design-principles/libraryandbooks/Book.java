package libraryandbooks;

public class Book {

	// attributes
	String title;
	String author;

	// parameterized constructor
	Book(String title, String author) {
		this.title= title;
		this.author= author;
	}

	// method to display book details
	public void displayBook() {
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
	}
}
