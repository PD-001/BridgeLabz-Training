package regexandjunit.junit.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClassThrowsArithmeticExceptionTest {
	ClassThrowsArithmeticException ctae= new ClassThrowsArithmeticException();
	
	@Test
	void verifyException() {
		assertThrows(ArithmeticException.class, ()->ctae.divide(5, 0));
	}
	

}
