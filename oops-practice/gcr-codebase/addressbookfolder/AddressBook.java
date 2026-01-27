package addressbookfolder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private List<Contact> contacts= null;
	
	public AddressBook(List<Contact> contacts) {
		setContacts(contacts);
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts= new LinkedList<>();
		this.contacts.addAll(contacts);
	}
	
	public void printContacts() {
		System.out.println(toString());
	}
	
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	
	public void editByName(String name, Scanner sc) {
		int i;
		if((i=existByName(name))!=-1) {
			int n=0;
			do {

				System.out.println("What would you like to edit?"
						+ "\nFirstName(1)"
						+ "\nLastname(2)"
						+ "\nAddress(3)"
						+ "\nCity(4)"
						+ "\nState(5)"
						+ "\nZip(6)"
						+ "\nPhone Number(7)"
						+ "\nEmail(8)"
						+ "\nNone(9)");
				
				n=sc.nextInt();
				sc.nextLine();
				
				switch(n) {
				case 1:
					System.out.println("New first Name:");
					contacts.get(i).setFirstName(sc.nextLine());
					break;
					
				case 2:
					System.out.println("New Last Name:");
					contacts.get(i).setLastName(sc.nextLine());
					break;
					
				case 3:
					System.out.println("New Address:");
					contacts.get(i).setAddress(sc.nextLine());
					break;
					
				case 4:
					System.out.println("New City name:");
					contacts.get(i).setCity(sc.nextLine());
					break;
					
				case 5:
					System.out.println("New State name");
					contacts.get(i).setState(sc.nextLine());
					break;
				
				case 6:
					System.out.println("New Zip:");
					contacts.get(i).setZip(sc.nextLine());
					break;
					
				case 7:
					System.out.println("New phone Number:");
					contacts.get(i).setPhoneNumber(sc.nextLine());
					break;
					
				case 8:
					System.out.println("New Email:");
					contacts.get(i).setEmail(sc.nextLine());
					break;
					
				case 9:
					System.out.println("Editing completed");
					break;
				
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			}
			while(n!=9);
			
		}
		else {
			System.out.println("No such contact");
		}
	}
	
	public int existByName(String name) {
		String[] fullname= name.split(" ");
		if(fullname.length<2) return -1;
		for(int i=0;i<contacts.size();i++) {
			if(contacts.get(i).getFirstName().equalsIgnoreCase(fullname[0]) && contacts.get(i).getLastName().equalsIgnoreCase(fullname[1])) {
				return i;
			}
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<getContacts().size();i++) {
			sb.append((i+1)).append(":\n").append(getContacts().get(i).toString()).append('\n');
		}
		return sb.toString();
	}
}
