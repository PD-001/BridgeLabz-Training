package linearandbinarysearch;

import java.util.Scanner;

public class ReverseUsingStringBuilder {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		//make a string builder object
		StringBuilder strBuilder= new StringBuilder();
		
		//append string to the object
		strBuilder.append(str);
		
		//reverse the string builder object
		strBuilder.reverse();
		
		//reconvert the string builder to string
		str=strBuilder.toString();
		
		System.out.println(str);
		sc.close();
	}
}
