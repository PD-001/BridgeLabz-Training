package regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.*;


public class ExtractCapitalizedWords {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String regex= "\\b[A-Z]{1}[a-z]+\\b";
		
		String str= sc.nextLine();
		
		Pattern p= Pattern.compile(regex);
		Matcher match= p.matcher(str);
		
		
		while(match.find()) {
			System.out.println(match.group());
		}
		sc.close();
	}
}
