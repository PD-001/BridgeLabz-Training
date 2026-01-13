package regexandjunit.junit.stringutility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {
	StringUtility strutil= new StringUtility();
	
	@Test
	void testRevers() {
		assertEquals("olleh", strutil.reverse("hello"));
	}
	
	@Test
	void testPallindrome() {
		assertEquals(true, strutil.isPalindrome("racecar"));
	}
	
	@Test
	void testToUpperCase() {
		assertEquals("TRUE", strutil.isPalindrome("true"));
	}
}
