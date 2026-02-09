package addressbookfolder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
		if(duplicateCheck(contact)) {
			System.out.println("Contact already exists");
			return;
		}
		this.contacts.add(contact);
	}

	public void editByName(String name, Scanner sc, Map<String, List<Contact>> cityMap, Map<String, List<Contact>> stateMap) {
		int i;
		if((i=existByName(name))!=-1) {
			Contact c = contacts.get(i);
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
					c.setFirstName(sc.nextLine());
					break;
					
				case 2:
					System.out.println("New Last Name:");
					c.setLastName(sc.nextLine());
					break;
					
				case 3:
					System.out.println("New Address:");
					c.setAddress(sc.nextLine());
					break;
					
				case 4:
					System.out.println("New City name:");
					String oldCity= c.getCity();
                    String newCity= sc.nextLine();
                    
                    if (cityMap.containsKey(oldCity)) {
                        cityMap.get(oldCity).remove(c);
                    }
                    
                    c.setCity(newCity);
                    
                    cityMap.computeIfAbsent(newCity, k -> new LinkedList<>()).add(c);
					break;
					
				case 5:
					System.out.println("New State name");
					String oldState= c.getState();
                    String newState= sc.nextLine();
                    
                    if (stateMap.containsKey(oldState)) {
                        stateMap.get(oldState).remove(c);
                    }
                    
                    c.setState(newState);
                    
                    stateMap.computeIfAbsent(newState, k -> new LinkedList<>()).add(c);
					break;
				
				case 6:
					System.out.println("New Zip:");
					c.setZip(sc.nextLine());
					break;
					
				case 7:
					System.out.println("New phone Number:");
					c.setPhoneNumber(sc.nextLine());
					break;
					
				case 8:
					System.out.println("New Email:");
					c.setEmail(sc.nextLine());
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
	
	private int existByName(String name) {
		String[] fullname= name.split(" ");
		if(fullname.length<2) return -1;
		
		Contact temp= new Contact();
		temp.setFirstName(fullname[0]);
		temp.setLastName(fullname[1]);
		
		for(int i=0;i<this.contacts.size();i++) {
			if(contacts.get(i).equals(temp)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public Contact deleteByName(String name) {
		int i;
		if((i=existByName(name))!=-1) {
			Contact c= this.contacts.remove(i);	
			System.out.println("Contact deleted");
			return c;
		}else {
			System.out.println("No such contact");
			return null;
		}
	}
	
	public void sortAndPrintContacts() {
	    contacts.stream()
	            .sorted((c1, c2)->{
	                int res=c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
	                if (res!=0) return res;
	                return c1.getLastName().compareToIgnoreCase(c2.getLastName());
	            })
	            .forEach(System.out::println);
	}

	private boolean duplicateCheck(Contact contact) {
		return contacts.contains(contact);
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
