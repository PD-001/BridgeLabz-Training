package strings;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		String longestWord= "";
		String currentWord= "";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch!=' ') {//find current word
				currentWord= currentWord + ch;
			}
			else {
				if(currentWord.length()>longestWord.length()) {//compare to longest word found till now
					longestWord= currentWord;
				}
				currentWord= "";
			}
		}
		
		//check last word
		if(currentWord.length()>longestWord.length()) {
			longestWord= currentWord;
		}
		
		System.out.println("Longest word: "+ longestWord);
		sc.close();
	}
}
