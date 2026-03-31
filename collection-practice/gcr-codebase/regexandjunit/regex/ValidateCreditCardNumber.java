package regexandjunit.regex;

import java.util.Scanner;

public class ValidateCreditCardNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		String regex="\\b[45][0-9]{15}\\b";
		
		if(str.matches(regex)) {
			System.out.println("Valid");
		}else
			System.out.println("Invalid");
		sc.close();
	}
}
