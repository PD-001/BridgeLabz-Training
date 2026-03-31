package addressbookfolder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddressBookDictionaryTest {

    private AddressBookDictionary dictionary;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    void setUp() {
        dictionary = new AddressBookDictionary();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void shouldAddNewAddressBook() {
        dictionary.addAddressBook("Office");

        assertTrue(outputStreamCaptor.toString()
                .contains("New address book created"));
    }

    @Test
    void shouldNotAddDuplicateAddressBook() {
        dictionary.addAddressBook("Office");
        dictionary.addAddressBook("Office");

        assertTrue(outputStreamCaptor.toString()
                .contains("AddressBook already exists"));
    }

    @Test
    void shouldHandleNonExistingAddressBook() {
        Scanner sc = new Scanner("5\n");
        dictionary.editAddressBook("Unknown", sc);

        assertTrue(outputStreamCaptor.toString()
                .contains("No such address book"));
    }

    @Test
    void shouldAddContactThroughMenu() {

        dictionary.addAddressBook("Home");
        
        String input = "1\nJohn\nDoe\nStreet 1\nDelhi\nDelhi\n110001\n9999999999\njohn@mail.com\n5\n";

        Scanner sc = new Scanner(input);

        dictionary.editAddressBook("Home", sc);

        assertTrue(outputStreamCaptor.toString()
                .contains("Contact added successfully."));
    }

    @Test
    void shouldDeleteContactThroughMenu() {

        dictionary.addAddressBook("Home");

        String input = "1\nJohn\nDoe\nStreet 1\nDelhi\nDelhi\n110001\n9999999999\njohn@mail.com\n4\nJohn Doe\n5\n";

        Scanner sc = new Scanner(input);

        dictionary.editAddressBook("Home", sc);

        assertTrue(outputStreamCaptor.toString()
                .contains("Exiting to Address Books"));
    }

    @Test
    void shouldShowNoContactsInCity() {
        dictionary.numberOfContactPersoninCity("Delhi");

        assertTrue(outputStreamCaptor.toString()
                .contains("No contacts found in Delhi"));
    }

    @Test
    void shouldShowNoContactsInState() {
        dictionary.numberOfContactPersoninState("Delhi");

        assertTrue(outputStreamCaptor.toString()
                .contains("No contacts found in Delhi"));
    }

    @Test
    void shouldCreateNewContact() {

        String input = "John\nDoe\nStreet 1\nDelhi\nDelhi\n110001\n9999999999\njohn@mail.com\n";

        Scanner sc = new Scanner(input);

        Contact contact = AddressBookDictionary.newContact(sc);

        assertEquals("John", contact.getFirstName());
        assertEquals("Delhi", contact.getCity());
        assertEquals("Delhi", contact.getState());
    }
}
