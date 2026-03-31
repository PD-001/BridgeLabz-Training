package linearandbinarysearch;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicatesUsongStringBuilder {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		//make string builder and hashset
		StringBuilder strBuilder= new StringBuilder();
		HashSet<Character> hs= new HashSet<>();
		
		//iterate and check if char exist in hashset or not
		for(int i=0;i<str.length();i++) {
			if(!hs.contains(str.charAt(i))) {
				hs.add(str.charAt(i));
				strBuilder.append(str.charAt(i));
			}
		}
		
		str=strBuilder.toString();
		
		System.out.println(str);
		sc.close();
	}
}
