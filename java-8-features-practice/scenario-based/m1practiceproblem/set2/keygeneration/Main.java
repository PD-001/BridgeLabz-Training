package m1practiceproblem.set2.keygeneration;

import java.util.*;
//import java.util.regex.*;

public class Main {
	
	public static boolean validateInput(String input) {
		
		if(input.length()<6) {
			System.out.println("Invalid Input (length < 6)");
			return false;
		}
		else if(input.contains(" ")) {
			System.out.println("Invalid Input (contains space)");
			return false;
		}
		else if(input.matches(".*\\d.*")) {
			System.out.println("Invalid Input (contains digits)");
			return false;
		}
		else if(!input.matches("[a-zA-Z]+")) {
			System.out.println("Invalid Input (contains special characters)");
			return false;
		}
		return true;
		
	}
	
	public static void generateKey(String input) {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append(input.toLowerCase());
		
		for(int i=0; i<sb.length(); i++) {
			
			if(sb.charAt(i)%2==0) {
				sb.deleteCharAt(i);
			}
			
		}
		
		sb.reverse();
		
		for(int i=0; i<sb.length(); i+=2) {
			sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		}
		
		System.out.println("The generated key is - "+sb.toString());
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		
		while(n-->0) {
			String input= sc.nextLine();
			
			if(input.isEmpty()) {
				System.out.println("Invalid Input (empty string)");
				continue;
			}
			
			boolean check= validateInput(input);
			
			if(check) {
				generateKey(input);
			}
		}
		
		
		
	}

}
