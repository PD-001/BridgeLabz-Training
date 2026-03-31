package regexandjunit.regex;

import java.util.Scanner;

public class ValidateLiscencePlate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String regex= "^[A-Z]{2}[1-9]{4}$";
		
		String str=sc.nextLine();
		
		if(str.matches(regex)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
