package review.doubleequalsvsdotequals;

public class Main {
	public static void main(String[] args) {
		String str1= "hello";
		String str2= new String("hello");
		
		if(str1==str2) {
			System.out.println("the two strings are equal according to double equals");
		}
		else {
			System.out.println("the two strings are not equal according to double equals");
		}
		if(str1.equals(str2)){
			System.out.println("the two strings are equal according to .equals method");
		}
		else {
			System.out.println("the two strings are not equal according to .equals method");
		}
		
	}
}
