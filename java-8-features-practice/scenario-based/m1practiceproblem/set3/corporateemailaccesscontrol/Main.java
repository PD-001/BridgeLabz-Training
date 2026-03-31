package m1practiceproblem.set3.corporateemailaccesscontrol;

import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void validateInput(String input) {
		
		Matcher matcher= Pattern.compile("^[a-z]{3,}\\.[a-z]{3,}[0-9]{4}@{1}(sales|marketing|IT|product)\\.company\\.com$").matcher(input);
		
		if(matcher.matches()) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-->0) {
			String input= sc.nextLine();
			
			validateInput(input);
		}
		
	}
	
}
