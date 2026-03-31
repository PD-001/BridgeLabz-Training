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
		    System.out.println("3. Search Person by City (Across Address Books)");
		    System.out.println("4. Search Person by State (Across Address Books)");
		    System.out.println("5. View Persons Grouped By City");
		    System.out.println("6. View Persons Grouped By State");
		    System.out.println("7. Count Persons by City");
		    System.out.println("8. Count Persons by State");
		    System.out.println("9. View All Contacts Sorted by Name");
		    System.out.println("10. Exit");

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
		            System.out.println("Enter city name:");
		            abdictionary.showPersonOfCity(sc.nextLine().trim());
		            break;
		            
		        case 4:
		        	System.out.println("Enter state name:");
		            abdictionary.showPersonOfState(sc.nextLine().trim());
		            break;

		        case 5:
		        	abdictionary.showPersonByCity();
		        	break;

		        case 6:
		        	abdictionary.showPersonByState();
		        	break;
		        	
		        case 7:
		        	System.out.println("Enter city name:");
		        	abdictionary.numberOfContactPersoninCity(sc.nextLine().trim());
		        	break;
		        	
		        case 8:
		        	System.out.println("Enter state name:");
		        	abdictionary.numberOfContactPersoninState(sc.nextLine().trim());
		        	break;
		        
		        case 9:
		            abdictionary.printSortedAllAddressBooksByName();
		            break;

		        case 10:
		            System.out.println("Exiting...");
		            break;

		        default:
		        	System.out.println("Invalid choice. Please try again.");
		        	break;
		    }
		} while (c != 10);

		sc.close();
	}

}