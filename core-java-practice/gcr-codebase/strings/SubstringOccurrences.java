package strings;

import java.util.Scanner;

public class SubstringOccurrences {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		String sub= sc.nextLine();
		
		int count= 0;
		
		for(int i=0;i<=str.length()-sub.length();i++) {
			boolean found= true;
			
			for(int j=0;j<sub.length();j++) {//loop over substring
				if(str.charAt(i+j)!=sub.charAt(j)) {//if char present in substring not present in string
					found= false;
					break;
				}
			}
			
			if(found) {//if all char match
				count++;
			}
		}
		
		System.out.println("Number of occurrences: "+ count);
		sc.close();
	}
}
