package regexandjunit.regex;

import java.util.Scanner;

public class ValidateHexCode {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String regex= "^[#]{1}[a-zA-z0-9]{6}";
		
		String str= sc.nextLine();
		
		if(str.matches(regex)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
