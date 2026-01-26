package addressbookfolder;

import java.util.LinkedList;
import java.util.List;

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
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<getContacts().size();i++) {
			sb.append((i+1)).append(":\n").append(getContacts().get(i).toString()).append('\n');
		}
		return sb.toString();
	}
}
