package regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguageNames {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String str= sc.nextLine();
		String regex= "\\b(Java|Python|JavaScript|Go)\\b";

		Pattern p= Pattern.compile(regex);
		Matcher m= p.matcher(str);

		while (m.find()) {
			System.out.println(m.group());
		}

		sc.close();
	}
}
