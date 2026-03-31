package functionalinterfaces.staticmethodinintefaces.passwordstrengthvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface SecurityUtils {
	
	public static boolean checkPasswordStrength(String password) {
		
		Matcher matcher= Pattern.compile("^[A-Za-z_][A-Za-z_0-9.:!@#$%^&]{8}$").matcher(password);
		return matcher.matches();
	}
	
}
