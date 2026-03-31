package bookshelf;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		List<Book> initialBooks= new LinkedList<>();
		Catalog catalog= new Catalog(initialBooks);

		int choice;

		do {

			System.out.println("\nBookshelf Menu:");
			System.out.println("1. Add Book");
			System.out.println("2. Search Book");
			System.out.println("3. Delete Book");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			choice= sc.nextInt();
			sc.nextLine();

			if (choice==1) {

				System.out.print("Enter Book Name: ");
				String bookName= sc.nextLine();

				System.out.print("Enter Author Name: ");
				String authorName= sc.nextLine();

				System.out.print("Enter Genre: ");
				String genre= sc.nextLine();

				Book book= new Book(bookName, authorName, genre);
				catalog.addBook(book);

				System.out.println("Book added successfully");
			}
			else if (choice==2) {

				System.out.print("Enter Book Name to Search: ");
				String bookName= sc.nextLine();

				Book book= catalog.searchBook(bookName);

				if (book!=null) {
					System.out.println("\nBook Found:");
					System.out.println("Book Name: "+ book.bookName);
					System.out.println("Author Name: "+ book.authorName);
					System.out.println("Genre: "+ book.genre);
				}
				else
					System.out.println("Book not found");
			}
			else if (choice==3) {

				System.out.print("Enter Book Name to Delete: ");
				String bookName= sc.nextLine();

				boolean deleted= catalog.deleteBook(bookName);

				if (deleted)
					System.out.println("Book deleted successfully");
				else
					System.out.println("Book not found");
			}

		} while (choice!=4);

		sc.close();
	}
}
