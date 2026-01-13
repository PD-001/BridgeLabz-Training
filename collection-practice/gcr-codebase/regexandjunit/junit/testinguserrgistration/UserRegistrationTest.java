package regexandjunit.junit.testinguserrgistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

	@Test
	void testValidRegistration() {
		assertTrue(UserRegistration.registerUser("Anubhav", "anubhav@example.com", "secret123"));
	}

	@Test
	void testEmptyUsername() {
		assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "a@example.com", "secret123"));
	}

	@Test
	void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Anubhav", "anubhavexample.com", "secret123"));
 }

	@Test
 	void testWeakPassword() {
		assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Anubhav", "anubhav@example.com", "123"));
	}
}