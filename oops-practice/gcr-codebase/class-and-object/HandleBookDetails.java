
public class HandleBookDetails {

	//declaring variables to store book details
	String bookTitle;
	String bookAuthor;
	double price;

	//constructor
	HandleBookDetails(String bookTitle, String bookAuthor, double price) {
		this.bookTitle= bookTitle;
		this.bookAuthor= bookAuthor;
		this.price= price;
	}

	//method to display book details
	public void displayBookDetails() {
		System.out.println("Title of the book: "+ bookTitle);
		System.out.println("Author of the book: "+ bookAuthor);
		System.out.println("Price of the book: "+ price);
	}

	public static void main(String[] args) {
		HandleBookDetails book1= new HandleBookDetails("2 States", "Chetan Bhagat", 500);
		HandleBookDetails book2= new HandleBookDetails("Wings Of Fire", "A. P. J. Abdul Kalam", 500);

		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
