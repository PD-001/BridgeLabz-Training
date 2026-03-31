package regexandjunit.junit.stringutility;

public class StringUtility {
	public String reverse(String str) {
		StringBuilder strBuilder= new StringBuilder();
		strBuilder.append(str);
		str=strBuilder.reverse().toString();
		return str;
	}
	
	public boolean isPalindrome(String str) {
	     return str.equalsIgnoreCase(reverse(str));
	 }

	 public String toUpperCase(String str) {
	     return str.toUpperCase();
	 }
}
