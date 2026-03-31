package flipkeylogicalproblem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Program p= new Program();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter a string:");
		String inp=sc.nextLine();
		
		String pass= p.CleanseAndInvert(inp);
		
		if(pass=="") System.out.println("Invalid Input");
		else System.out.println("The generated key is - "+ pass);
		
		
		
		
	}
}
