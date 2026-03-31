package strings;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		//reverse string and check if same
		String reversed= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed= reversed + str.charAt(i);
		}
		
		if(str.equals(reversed)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		sc.close();
	}
}
