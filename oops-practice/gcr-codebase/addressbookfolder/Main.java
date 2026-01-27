package addressbookfolder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc= new Scanner(System.in);
		
		AddressBookDictionary abdictionary= new AddressBookDictionary();

		int c= 0;
		do {
		    System.out.println("\nMenu:");
		    System.out.println("1. Add Address Book");
		    System.out.println("2. Edit Address Book");
		    System.out.println("3. Exit");

		    c= sc.nextInt();
		    sc.nextLine();

		    switch (c) {
		        case 1:
		            System.out.println("Enter Address Book name:");
		            abdictionary.addAddressBook(sc.nextLine());
		            break;

		        case 2:
		            System.out.println("Enter Address Book name:");
		            abdictionary.editAddressBook(sc.nextLine(), sc);
		            break;

		        case 3:
		            System.out.println("Exiting...");
		            break;
		    }
		} while (c != 3);

		

		sc.close();
	}

}