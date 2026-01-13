package regexandjunit.junit.passwordstrengthvalidator;

public class PasswordValidator {
	
	public boolean checkPassword(String pass) {
		String regex="^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
		if(pass.matches(regex)) return true;
		return false;
	}
}