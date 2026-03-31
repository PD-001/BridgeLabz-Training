package paragraphformatter;

import java.util.Arrays;
import java.util.Scanner;

public class ParagraphFormatter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();

		//remove extra spaces
		str= str.trim().replaceAll(" +", " ");
		
		
		//edge case handling for if string is empty
		if(str.isEmpty()) {
			System.out.println("String Empty");
			return;
		}
		
		//split string into string array for easy operations
		String[] strArray= str.split(" ");
		
		String replaceBy= "hello";
		
		//function to count no of words
		int count= countWords(strArray);
		System.out.println(count);
		
		//function to find largest word
		String largestWord= findLongestWord(strArray);
		System.out.println(largestWord);
		
		//function to replace occurrence of a particular word with another
		str= str.replaceAll("(?i)you", replaceBy);
		System.out.println(str);
	}
	
	public static int countWords(String[] strArray) {
		if(strArray.length==0) {
			return 0;
		}
		return strArray.length;
	}
	
	public static String findLongestWord(String[] strArray) {
		String longest= "";
		
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i].length()>longest.length()) {
				longest=strArray[i];
			}
		}
		
		return longest;
	}
	
}
