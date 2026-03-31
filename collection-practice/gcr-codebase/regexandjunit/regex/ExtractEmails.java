package regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String regex= "\\b[a-zA-Z0-9_+.]+@[a-zA-Z]+\\.[a-z]{2,}\\b";
		
		String str= sc.nextLine();
		
		Pattern p= Pattern.compile(regex);
		Matcher m= p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		sc.close();
	}
}
