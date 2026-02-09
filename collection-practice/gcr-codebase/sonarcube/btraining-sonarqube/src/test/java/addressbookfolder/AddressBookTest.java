package addressbookfolder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class AddressBookTest {
	
	@Test
	void shouldAddContactSuccessfully() {
        AddressBook book = new AddressBook(new LinkedList<>());

        Contact contact = new Contact(
                "John", "Doe",
                "Street 1", "Delhi",
                "Delhi", "110001",
                "9999999999", "john@test.com"
        );

        book.addContact(contact);

        assertEquals(1, book.getContacts().size());
        assertTrue(book.getContacts().contains(contact));
    }
	
	@Test
	void shouldNotAddDuplicateContact() {
	    AddressBook book = new AddressBook(new LinkedList<>());

	    Contact contact = new Contact(
	            "John", "Doe",
	            "Street 1", "Delhi",
	            "Delhi", "110001",
	            "9999999999", "john@test.com"
	    );

	    book.addContact(contact);
	    book.addContact(contact); // duplicate

	    assertEquals(1, book.getContacts().size());
	}

	@Test
	void shouldDeleteExistingContact() {
	    Contact contact = new Contact(
	            "John", "Doe",
	            "Street 1", "Delhi",
	            "Delhi", "110001",
	            "9999999999", "john@test.com"
	    );

	    AddressBook book = new AddressBook(new LinkedList<>());
	    book.addContact(contact);

	    Contact deleted = book.deleteByName("John Doe");

	    assertNotNull(deleted);
	    assertEquals(0, book.getContacts().size());
	}

	@Test
	void shouldReturnNullWhenDeletingNonExistingContact() {
	    AddressBook book = new AddressBook(new LinkedList<>());

	    Contact deleted = book.deleteByName("Unknown Person");

	    assertNull(deleted);
	}

}
