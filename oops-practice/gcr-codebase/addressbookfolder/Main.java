package addressbookfolder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc= new Scanner(System.in);
		List<Contact> contacts= new LinkedList<>();

		while (true) {

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

			contacts.add(contact);

			System.out.print("\nDo you want to add another contact? (yes/no): ");
			String choice= sc.nextLine();

			if (!choice.equalsIgnoreCase("yes"))
				break;
		}

		AddressBook addressBook= new AddressBook(contacts);

		System.out.println("\nContacts in Address Book:");
		addressBook.printContacts();

		sc.close();
	}
}
