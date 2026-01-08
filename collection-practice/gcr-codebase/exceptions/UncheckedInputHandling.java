package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedInputHandling {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b, result=0;
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error:"+ e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}
}
