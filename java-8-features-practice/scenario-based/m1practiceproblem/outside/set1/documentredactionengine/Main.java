package m1practiceproblem.outside.set1.documentredactionengine;

import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void redact(String input) {
		
		input= input.replaceAll("ID\\:[A-Z]{3}\\d{6}","ID:XXX******");
		
		input= input.replaceAll("ACCT\\-\\d{4}-\\d{4}-(\\d{4})", "ACCT---$1");
		
		Pattern repeatPattern= Pattern.compile("(?i)\\b(\\w+)\\s+\\1\\b");
		Matcher repeatMatch= repeatPattern.matcher(input);
		while(repeatMatch.find()) {
			input= repeatMatch.replaceAll("$1");
			repeatMatch= repeatPattern.matcher(input);
		}
		
		input= input.replaceAll("([!?\\.])\\1{2,}$", "$1");
		
		System.out.println(input);
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String input= sc.nextLine();
			
			redact(input);
		}
		
	}
	
}
