package regexandjunit.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingWords {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		HashMap<String, Integer> hm= new HashMap<>(); 
		
		String str= sc.nextLine();
		
		String[] strArray= str.split("[,\\s\\.]");
		
		for(String s:strArray) {
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		
//		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
//			if(entry.getValue()>=2) {
//				System.out.println(entry.getKey());
//			}
//		}
		
		for(String key: hm.keySet()) {
			if(hm.get(key)>=2) {
				System.out.println(key);
			}
		}
		
	}
}
