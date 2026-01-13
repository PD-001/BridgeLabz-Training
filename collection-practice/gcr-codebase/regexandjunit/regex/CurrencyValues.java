package regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValues {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		Matcher m= Pattern.compile("\\$?\\b[0-9]+\\.[0-9]+\\b").matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		sc.close();
	}
}
