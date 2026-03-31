package strings;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		int vowels= 0;
		int consonants= 0;
		
		str=str.toLowerCase();//convert the whole string to lowercase
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch>='a' || ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {//check if they are either of the vowels
					vowels++;
				}
				else {//if not then they are consonants
					consonants++;
				}
			}
		}
		
		System.out.println("No. of Vowels:"+ vowels +"and No. of Consonants:"+ consonants);
		sc.close();
	}
}
