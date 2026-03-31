package regexandjunit.junit.passwordstrengthvalidator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest {
	PasswordValidator pv= new PasswordValidator();
	
	@ParameterizedTest
	@ValueSource(strings={"A1jbdsfjsk","sabdaQ2dsgs","sajkhdbs2D"})
	void checkPassForStrong(String pass) {
		assertEquals(true, pv.checkPassword(pass));
	}
	
	@ParameterizedTest
	@ValueSource(strings={"1jbdsfjsk","Q2dsgs","sajkhdbsD"})
	void checkPassforWeak(String pass) {
		assertEquals(false, pv.checkPassword(pass));
	}
}
