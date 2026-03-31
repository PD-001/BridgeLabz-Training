package sentenceformatter;

import java.util.Scanner;

public class SeantenceFormatter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		boolean flag= true;
		
		StringBuilder strBuilder= new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==',') {
				strBuilder.append(str.charAt(i));
				strBuilder.append(" ");
			}
			else if(str.charAt(i)=='.'||str.charAt(i)=='!'||str.charAt(i)=='?') {
				strBuilder.append(str.charAt(i));
				strBuilder.append(" ");
				flag= true;
			}
			else if((str.charAt(i)>='a' && str.charAt(i)<='z') && flag) {
				strBuilder.append(Character.toUpperCase(str.charAt(i)));
				flag= false;
			}
			else strBuilder.append(str.charAt(i));
		}
		
		str= strBuilder.toString();
		
		str= str.trim().replaceAll(" +"," ");
		
		System.out.println(str);
	}
}
