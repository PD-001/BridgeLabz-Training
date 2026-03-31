
public class Book {

	//attributes
	String title;
	String author;
	double price;

	//default constructor
	Book() {
		title= "Unknown";
		author= "Unknown";
		price= 0.0;
	}

	//parameterized constructor
	Book(String title, String author, double price) {
		this.title= title;
		this.author= author;
		this.price= price;
	}

	//creating method to display book details
	public void displayBookDetails() {
		System.out.println("Book Title: "+ title);
		System.out.println("Book Author: "+ author);
		System.out.println("Book Price: "+ price);
	}

	public static void main(String[] args) {

		//using default constructor
		Book book1= new Book();
		book1.displayBookDetails();

		System.out.println();

		// using parameterized constructor
		Book book2= new Book("1984", "George Orwell", 399.50);
		book2.displayBookDetails();
	}
}
