package addressbookfolder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc= new Scanner(System.in);
		List<Contact> contacts= new LinkedList<>();
		AddressBook addressBook= new AddressBook(contacts);

		int choice= 0;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Add New Contact");
			System.out.println("2. View All Contacts");
			System.out.println("3. Edit Details by Name");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice=sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					Contact contact= newContact(sc);
					addressBook.addContact(contact);
					System.out.println("Contact added successfully.");
					break;

				case 2:
					System.out.println("\nContacts in Address Book:");
					addressBook.printContacts();
					break;

				case 3:
					System.out.println("Please enter name of employee:");
					addressBook.editByName(sc.nextLine(), sc);
					break;
					
				case 4:
					System.out.println("Exiting Address Book Program...");
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
					break;
			}

		} while (choice!=4);

		sc.close();
	}

	public static Contact newContact(Scanner sc) {
		System.out.println("\nEnter Contact Details");
		System.out.print("First Name: ");
		String firstName= sc.nextLine();

		System.out.print("Last Name: ");
		String lastName= sc.nextLine();

		System.out.print("Address: ");
		String address= sc.nextLine();

		System.out.print("City: ");
		String city= sc.nextLine();

		System.out.print("State: ");
		String state= sc.nextLine();

		System.out.print("Zip: ");
		String zip= sc.nextLine();

		System.out.print("Phone Number: ");
		String phoneNumber= sc.nextLine();

		System.out.print("Email: ");
		String email= sc.nextLine();

		Contact contact= new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		return contact;
	}
}