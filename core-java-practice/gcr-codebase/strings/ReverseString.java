package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		String reversed= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed= reversed + str.charAt(i);//add last char each time
		}
		
		System.out.println("Reversed String: "+ reversed);
		sc.close();
	}
}