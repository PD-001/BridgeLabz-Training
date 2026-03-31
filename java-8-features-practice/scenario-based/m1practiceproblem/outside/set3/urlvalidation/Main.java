package m1practiceproblem.outside.set3.urlvalidation;

import java.util.*;
import java.util.regex.*;

public class Main {
	
	static HashSet<String> set= new HashSet<>();
	
	public static String validateURL(String url) {
		
		Pattern format= Pattern.compile("^(http://|https://)[a-zA-Z]+\\.[a-zA-Z]+$");
		Matcher m= format.matcher(url);
		
		if(!m.matches()) {
			
			if(!(url.startsWith("http://") || url.startsWith("https://"))) {
				return "INVALID URL: protocol is invalid";
			}
			
			return "INVALID URL: format is invalid";
		}
		
		if(!(url.startsWith("http://") || url.startsWith("https://"))) {
			return "INVALID URL: protocol is invalid";
		}
		
		String temp= url.substring(url.indexOf("://")+3);
		String[] arr= temp.split("\\.");
		
		String website= arr[0];
		String domain= "."+arr[1];
		
		if(!website.matches("[a-z]+") || website.length()>10) {
			return "INVALID URL: website name is invalid";
		}
		
		if(!(domain.equals(".com") || domain.equals(".co") ||
		     domain.equals(".in") || domain.equals(".org") ||
		     domain.equals(".gov"))) {
			return "INVALID URL: domain is invalid";
		}
		
		if(set.contains(url)) {
			return "DUPLICATE URL FOUND";
		}
		
		set.add(url);
		
		return "VALID URL";
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			
			if(line.trim().length()==0) continue;
			
			String[] urls= line.split("\\s+");
			
			for(String url: urls) {
				System.out.println(validateURL(url));
			}
		}
	}
}