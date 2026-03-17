package m1practiceproblem.outside.set2.expressiontagscoringengine;

import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static String process(String op, String exp) {
		
		String[] arr= exp.split(",");
		
		ArrayList<Integer> list= new ArrayList<>();
		
		for(String s: arr) {
			
			if(!s.matches("-?(0|[1-9][0-9]*)")) return "ERROR";
			
			list.add(Integer.parseInt(s));
		}
		
		if(list.size()<2) return "ERROR";
		
		if(op.equals("SUM")) {
			
			int sum=0;
			for(int x: list) sum+=x;
			return sum+"";
		}
		
		else if(op.equals("MUL")) {
			
			int mul=1;
			for(int x: list) mul*=x;
			return mul+"";
		}
		
		else if(op.equals("MAX")) {
			
			int max= Integer.MIN_VALUE;
			for(int x: list) max= Math.max(max, x);
			return max+"";
		}
		
		else {
			
			int min= Integer.MAX_VALUE;
			for(int x: list) min= Math.min(min, x);
			return min+"";
		}
	}
	
	public static String evaluate(String input) {
		
		Pattern pattern= Pattern.compile("\\[(SUM|MUL|MAX|MIN):([0-9,-]+)\\]");
		Matcher matcher= pattern.matcher(input);
		
		StringBuffer result= new StringBuffer();
		
		while(matcher.find()) {
			
			String op= matcher.group(1);
			String exp= matcher.group(2);
			
			String replacement= process(op, exp);
			
			matcher.appendReplacement(result, replacement);
		}
		
		matcher.appendTail(result);
		
		Pattern invalid= Pattern.compile("\\[[^\\]]*");
		Matcher m2= invalid.matcher(result.toString());
		
		StringBuffer finalResult= new StringBuffer();
		
		while(m2.find()) {
			m2.appendReplacement(finalResult, "ERROR");
		}
		
		m2.appendTail(finalResult);
		
		return finalResult.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String line= sc.nextLine();
			
			System.out.println(evaluate(line));
		}
	}
}