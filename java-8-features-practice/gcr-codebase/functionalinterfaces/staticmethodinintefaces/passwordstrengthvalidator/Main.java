package functionalinterfaces.staticmethodinintefaces.passwordstrengthvalidator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("I the password strong enough: "+ SecurityUtils.checkPasswordStrength(sc.nextLine()));
		
	}
}
