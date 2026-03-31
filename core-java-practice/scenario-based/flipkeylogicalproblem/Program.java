package flipkeylogicalproblem;

public class Program {
	
	public String CleanseAndInvert(String input) {
		
		if(input==null || input.length()<=6) {
			return "";
		}
		
		for(char c: input.toCharArray()) {
			if(!Character.isLetter(c))
				return "";
		}
		
		input=input.toLowerCase();
		
		StringBuilder sb= new StringBuilder();
		
		for(char c: input.toCharArray()) {
			if(!(c%2==0)) sb.append(c);
		}
		
		sb.reverse();
		
		input=sb.toString();
		
		sb.delete(0, sb.length());
		
		for(int i=0;i<input.length();i++) {
			if(i%2==0) {
				sb.append(Character.toUpperCase(input.charAt(i)));
			}else {
				sb.append(input.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
}
