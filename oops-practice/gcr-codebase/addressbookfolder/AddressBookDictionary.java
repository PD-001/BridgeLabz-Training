package addressbookfolder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookDictionary {
	private HashMap<String, AddressBook> dictionary= null;
	private HashMap<String, List<Contact>> allPeopleInCity= null;
	private HashMap<String, List<Contact>> allPeopleInState= null;
	
	public AddressBookDictionary() {
		dictionary= new HashMap<String, AddressBook>();
		allPeopleInCity= new HashMap<>();
		allPeopleInState= new HashMap<>();
	}
	
	public void addAddressBook(String name) {
		if(dictionary.containsKey(name)) {
			System.out.println("AddressBook already exists");
			return;
		}
		dictionary.put(name, new AddressBook(new LinkedList<>()));
		System.out.println("New address book created");
	}
	
	public void showPersonOfCity(String city) {
		
		Map<String, List<Contact>> hm= dictionary.entrySet().stream()
				.collect(Collectors.toMap(
						ab->ab.getKey(), 
						ab->ab.getValue()
						.getContacts().stream()
						.filter(c->c.getCity().equalsIgnoreCase(city)).toList()
						));
		
		hm.entrySet().stream()
			.filter(ab->!ab.getValue().isEmpty())
			.forEach(ab->{
				System.out.println("City -"+ ab.getKey());
				ab.getValue().forEach(System.out::println);
			});
		
	}
	
	public void numberOfContactPersoninCity(String city) {

	    List<Contact> list= allPeopleInCity.get(city);

	    if (list!=null) {
	        System.out.println(city +" - "+ list.size());
	    } else {
	        System.out.println("No contacts found in "+ city);
	    }
	}


	public void numberOfContactPersoninState(String state) {

	    List<Contact> list= allPeopleInState.get(state);

	    if (list!=null) {
	        System.out.println(state +" - "+ list.size());
	    } else {
	        System.out.println("No contacts found in "+ state);
	    }
	}
	
	public void showPersonOfState(String state) {
		
		Map<String, List<Contact>> hm= dictionary.entrySet().stream()
				.collect(Collectors.toMap(
						ab->ab.getKey(), 
						ab->ab.getValue()
						.getContacts().stream()
						.filter(c->c.getState().equalsIgnoreCase(state)).toList()
						));
		
		hm.entrySet().stream()
		.filter(ab->!ab.getValue().isEmpty())
		.forEach(ab->{
			System.out.println("State -"+ ab.getKey());
			ab.getValue().forEach(System.out::println);
		});
		
	}
	
	public void showPersonByCity() {
		allPeopleInCity.entrySet().stream()
			.forEach(ab->{
				System.out.println("City -"+ ab.getKey());
				ab.getValue().forEach(System.out::println);
			});
		
	}
	
	public void showPersonByState() {
		allPeopleInState.entrySet().stream()
		.forEach(ab->{
			System.out.println("State -"+ ab.getKey());
			ab.getValue().forEach(System.out::println);
		});
		
	}
		
	public void editAddressBook(String name, Scanner sc) {

		if(dictionary.containsKey(name)) {
			AddressBook addressBook= dictionary.get(name);
			int choice= 0;

			do {
				System.out.println("\nMenu:");
				System.out.println("1. Add New Contact");
				System.out.println("2. View All Contacts");
				System.out.println("3. Edit Details by Name");
				System.out.println("4. Delete By Name");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");

				choice=sc.nextInt();
				sc.nextLine();

				switch (choice) {
					case 1:
						Contact contact= newContact(sc);
						allPeopleInCity.computeIfAbsent(contact.getCity(), l->new LinkedList<Contact>()).add(contact);
						allPeopleInState.computeIfAbsent(contact.getState(), l->new LinkedList<Contact>()).add(contact);
						addressBook.addContact(contact);
						System.out.println("Contact added successfully.");
						break;

					case 2:
						System.out.println("Contacts in Address Book:");
						addressBook.printContacts();
						break;

					case 3:
						System.out.println("Please enter full name of employee:");
						String nameToEdit= sc.nextLine();
						addressBook.editByName(nameToEdit, sc, allPeopleInCity, allPeopleInState);
						break;
						
					case 4:
						System.out.println("Please enter full name of employee:");
						String nameToDelete= sc.nextLine();
						Contact deletedContact= addressBook.deleteByName(nameToDelete);
						
						if (deletedContact!=null) {
					        if (allPeopleInCity.containsKey(deletedContact.getCity())) {
					            allPeopleInCity.get(deletedContact.getCity()).remove(deletedContact);
					        }
					        if (allPeopleInState.containsKey(deletedContact.getState())) {
					            allPeopleInState.get(deletedContact.getState()).remove(deletedContact);
					        }
					    }
						
						break;

					case 5:
						System.out.println("Exiting to Address Books");
						break;
						
					default:
						System.out.println("Invalid choice. Please try again.");
						break;
				}

			} while (choice!=5);

		}
		else {
			System.out.println("No such address book");
		}
		
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
