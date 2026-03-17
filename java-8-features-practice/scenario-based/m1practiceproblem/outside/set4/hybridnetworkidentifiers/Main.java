package m1practiceproblem.outside.set4.hybridnetworkidentifiers;

import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static String validateIdentifier(String input) {
		
		if(input.contains(" ")) return "REJECTED DEVICE";
		
		if(input.indexOf("::")==-1 || input.indexOf("::")!=input.lastIndexOf("::")) {
			return "REJECTED DEVICE";
		}
		
		String[] parts= input.split("::");
		
		if(parts.length!=2) return "REJECTED DEVICE";
		
		String ip6= parts[0];
		String mac= parts[1];
		
		String[] ipParts= ip6.split(":");
		
		if(ipParts.length!=8) return "REJECTED DEVICE";
		
		for(String p: ipParts) {
			if(!p.matches("[0-9a-fA-F]{1,4}")) {
				return "REJECTED DEVICE";
			}
		}
		
		String[] macParts= mac.split(":");
		
		if(macParts.length!=6) return "REJECTED DEVICE";
		
		for(String p: macParts) {
			if(!p.matches("[0-9A-F]{2}")) {
				return "REJECTED DEVICE";
			}
		}
		
		return "AUTHENTIC DEVICE";
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			
			System.out.println(validateIdentifier(line));
		}
	}
}