package strings;

import java.util.Scanner;

public class RemoveDupicates {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		String result= "";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			boolean isDuplicate= false;
			
			for(int j=0;j<result.length();j++) {//loop over result to check if already present
				if(ch==result.charAt(j)) {
					isDuplicate= true;
					break;
				}
			}
			
			if(!isDuplicate) {//if not present add to result
				result= result + ch;
			}
		}
		
		System.out.println("String after removing duplicates: "+ result);
		sc.close();
	}
}
