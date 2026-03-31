package regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPV4Address {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str= sc.nextLine();
		
		Matcher m= Pattern.compile("\\b(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])(\\\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])){3}\\b").matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		sc.close();
	}
}
