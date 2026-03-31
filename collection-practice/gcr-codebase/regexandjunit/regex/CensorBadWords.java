package regexandjunit.regex;

import java.util.Scanner;

public class CensorBadWords {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		String[] badWords= {"Damn","stupid"};
		
		for(String bw:badWords) {
			str=str.replaceAll("(?i)"+bw, "****");
		}
		System.out.println(str);
		sc.close();
	}
}
