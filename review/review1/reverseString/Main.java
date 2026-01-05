package review.reverseString;

public class Main {
	public static void main(String[] args) {
		String str= "hello";
		StringBuilder strBuilder= new StringBuilder();
		strBuilder.append(str);
		str=strBuilder.reverse().toString();
		System.out.println(str);
	}
}
