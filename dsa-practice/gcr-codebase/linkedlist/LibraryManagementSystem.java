class BookNode {
	int bookId;
	String title;
	String author;
	String genre;
	boolean isAvailable;
	BookNode next;
	BookNode prev;

	BookNode(int bookId,String title,String author,String genre,boolean isAvailable) {
		this.bookId= bookId;
		this.title= title;
		this.author= author;
		this.genre= genre;
		this.isAvailable= isAvailable;
		this.next= null;
		this.prev= null;
	}
}

public class LibraryManagementSystem {

	private BookNode head;

	//add at beginning
	public void addAtBeginning(int bookId,String title,String author,String genre,boolean isAvailable) {
		BookNode newNode= new BookNode(bookId,title,author,genre,isAvailable);

		if (head!=null) {
			newNode.next= head;
			head.prev= newNode;
		}
		head= newNode;
	}

	//add at end
	public void addAtEnd(int bookId,String title,String author,String genre,boolean isAvailable) {
		BookNode newNode= new BookNode(bookId,title,author,genre,isAvailable);

		if (head==null) {
			head= newNode;
			return;
		}

		BookNode temp= head;
		while (temp.next!=null) {
			temp= temp.next;
		}
		temp.next= newNode;
		newNode.prev= temp;
	}

	//remove by book id
	public void removeByBookId(int bookId) {
		if (head==null) {
			return;
		}

		if (head.bookId==bookId) {
			head= head.next;
			if (head!=null) {
				head.prev= null;
			}
			return;
		}

		BookNode temp= head;
		while (temp!=null && temp.bookId!=bookId) {
			temp= temp.next;
		}

		if (temp!=null) {
			if (temp.next!=null) {
				temp.next.prev= temp.prev;
			}
			if (temp.prev!=null) {
				temp.prev.next= temp.next;
			}
		}
	}

	//search by title
	public void searchByTitle(String title) {
		BookNode temp= head;

		while (temp!=null) {
			if (temp.title.equalsIgnoreCase(title)) {
				displayBook(temp);
			}
			temp= temp.next;
		}
	}

	//search by author
	public void searchByAuthor(String author) {
		BookNode temp= head;

		while (temp!=null) {
			if (temp.author.equalsIgnoreCase(author)) {
				displayBook(temp);
			}
			temp= temp.next;
		}
	}

	//update availability
	public void updateAvailability(int bookId,boolean status) {
		BookNode temp= head;

		while (temp!=null) {
			if (temp.bookId==bookId) {
				temp.isAvailable= status;
				return;
			}
			temp= temp.next;
		}
	}

	//display forward
	public void displayForward() {
		BookNode temp= head;

		while (temp!=null) {
			displayBook(temp);
			temp= temp.next;
		}
	}

	//display reverse
	public void displayReverse() {
		if (head==null) {
			return;
		}

		BookNode temp= head;
		while (temp.next!=null) {
			temp= temp.next;
		}

		while (temp!=null) {
			displayBook(temp);
			temp= temp.prev;
		}
	}

	//count books
	public void countBooks() {
		int count= 0;
		BookNode temp= head;

		while (temp!=null) {
			count++;
			temp= temp.next;
		}
		System.out.println("Total Books: "+count);
	}

	private void displayBook(BookNode book) {
		System.out.println("Book ID: "+book.bookId);
		System.out.println("Title: "+book.title);
		System.out.println("Author: "+book.author);
		System.out.println("Genre: "+book.genre);
		System.out.println("Available: "+book.isAvailable);
		System.out.println();
	}

	public static void main(String[] args) {

		LibraryManagementSystem library= new LibraryManagementSystem();

		library.addAtEnd(1,"Java Basics","James Gosling","Programming",true);
		library.addAtEnd(2,"Clean Code","Robert Martin","Software",true);
		library.addAtBeginning(3,"DSA","Narasimha Karumanchi","Education",false);

		library.displayForward();

		library.searchByAuthor("Robert Martin");
		library.updateAvailability(1,false);

		System.out.println("Reverse Display:");
		library.displayReverse();

		library.countBooks();
	}
}
