package regexandjunit.junit.testingparameterizedtests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ChecksEvenTest {
	ChecksEven ce= new ChecksEven();
	
	@ParameterizedTest
	@ValueSource(ints= {2,4,6})
	void checkEven(int num) {
		assertTrue(ce.isEven(num));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {3,5,7})
	void checkOdd(int num) {
		assertFalse(ce.isEven(num));
	}
}
