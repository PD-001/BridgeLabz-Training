package regexandjunit.junit.testingdateformatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

public class DateFormatterTest {
	
	@Test
	void testDateValid() throws ParseException {
		assertEquals("21-06-2004", DateFormatter.formatDate("2004-06-21"));
	}
	
	@Test
	void testInvalidDateFormat() {
	     assertThrows(ParseException.class, () -> DateFormatter.formatDate("21*98985665"));
	 }
}
