package regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		Matcher m= Pattern.compile("\\b[0-9]{3}\\-[0-9]{2}\\-[0-9]{4}\\b").matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
