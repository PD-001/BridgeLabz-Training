package lexicaltwist;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first word:");
		String firstWord= sc.nextLine();
		System.out.print("Enter second word:");		
		String secondWord= sc.nextLine();
		
		String result= checkreverse(firstWord,secondWord);
		System.out.println("Check if reversed version?"+ result);
		
		if(result.equalsIgnoreCase("yes")) {
			firstWord= transformFirstWord(firstWord);
			System.out.println("Transformed first word:"+ firstWord);
		}
		else {
			operationsOnCombinedWords(firstWord, secondWord);
		}
		sc.close();
	}
	

	public static String checkreverse(String firstWord, String secondWord) {
		
		if(firstWord.length()!=secondWord.length()) return "No";
		
		firstWord= firstWord.toLowerCase();
		secondWord= secondWord.toLowerCase();
		
		for(int i=0;i<firstWord.length();i++) {
			if(firstWord.charAt(i)!=secondWord.charAt((secondWord.length()-1)-i)) return "No";
		}
		
		return "Yes";
	}
	
	public static String transformFirstWord(String firstword) {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append(firstword);
		
		sb.reverse();
		
		firstword= sb.toString().toLowerCase();
		
		sb.delete(0, sb.length());
		
		for(int i=0;i<firstword.length();i++) {
			char ch= firstword.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ch= '@';
			sb.append(ch);
		}
		
		return sb.toString();

	}
	
	public static void operationsOnCombinedWords(String firstWord, String secondWord) {
		String newWord= firstWord+secondWord;
		
		newWord= newWord.toUpperCase();
		
		char[] word= newWord.toCharArray();
		
		int countVowels= 0;
		
		for(int i=0;i<word.length;i++) {
			if(word[i]=='A'||word[i]=='E'||word[i]=='I'||word[i]=='O'||word[i]=='U') {
				countVowels++;
			}
		}
		
		int countConsonants= word.length - countVowels;
		
		if(countVowels>countConsonants) {
			int c= 0;
			HashSet<Character> hs= new HashSet<>();
			for(int i=0;i<word.length;i++) {
				if(c==2) break;
				if(word[i]=='A'||word[i]=='E'||word[i]=='I'||word[i]=='O'||word[i]=='U') {
					if(!hs.contains(word[i])) {
						System.out.print(word[i]);
						hs.add(word[i]);
						c++;
					}
				}
			}
		}
		else if(countVowels<countConsonants) {
			int c= 0;
			HashSet<Character> hs= new HashSet<>();
			for(int i=0;i<word.length;i++) {
				if(c==2) break;
				if(word[i]!='A' && word[i]!='E' && word[i]!='I' && word[i]!='O' && word[i]!='U') {
					if(!hs.contains(word[i])) {
						System.out.print(word[i]);
						hs.add(word[i]);
						c++;
					}
				}
			}
		}
		else {
			System.out.println("Vowels and consonants are equal");
		}
		
	}
}
