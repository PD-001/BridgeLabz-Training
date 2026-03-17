package m1practiceproblem.set1.globalshipment;

import java.util.*;
import java.util.regex.*;
import java.time.LocalDate;

public class Main {

	public static String validateInput(String[] inputArray) {
		if(inputArray.length<5 || inputArray.length>5) {
			System.out.println("length");
			return "NON-COMPLIANT RECORD";
		}
		
		if(validateCode(inputArray[0]) && validateDate(inputArray[1]) && validateMode(inputArray[2]) && validateWeight(inputArray[3]) && validateStatus(inputArray[4]) ) {
			return "COMPLIANT RECORD";
		}
		
		return "NON-COMPLIANT RECORD";
	}
	
	public static boolean validateCode(String inp) {
		
		Matcher matcher= Pattern.compile("^(?!.*(\\d)\\1{3})SHIP\\-[1-9][0-9]{5}$").matcher(inp);
		
		if(matcher.matches()) return true;
		
		System.out.println("code");
		return false;
		
	}
	
	public static boolean validateDate(String inp) {
		
		try {
			LocalDate date= LocalDate.parse(inp);
			
			if( date.getYear()>2000 && date.getYear()<2099 ) {
				return true;
			}
		}
		catch(Exception e) {
			System.out.println("date");
			return false;			
		}
		return false;
	}
	
	public static boolean validateMode(String inp) {
		List<String> modes= new ArrayList(Arrays.asList("AIR", "SEA", "ROAD", "RAIL", "EXPRESS", "FREIGHT"));
		
		if(modes.contains(inp)) {
			return true;
		}
		
		System.out.println("mode");
		return false;
	}
	
	public static boolean validateWeight(String inp) {
		
		if(Double.parseDouble(inp)<0 || Double.parseDouble(inp)>999999.9) return false;
		
		Matcher matcher= Pattern.compile("^(0|[1-9][0-9]+)(\\.[0-9]{1,2}){0,1}$").matcher(inp);
			
		if(matcher.matches()) {
			return true;
		}
		
		System.out.println("weight");
		return false;
	}
	
	public static boolean validateStatus(String inp) {
		List<String> statuses= new ArrayList(Arrays.asList("DELIVERED", "CANCELLED", "IN_TRANSIT"));
		
		if(statuses.contains(inp)) {
			return true;
		}
		
		System.out.println("status");
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-->0) {
			String input= sc.nextLine();
			
			String[] inputArray= input.split("\\|");
			
//			for(String i:inputArray) {
//				System.out.println(i);
//			}
			
			String output= validateInput(inputArray);
			
			System.out.println(output);
			
		}
		
	}
	
}
