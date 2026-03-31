package methods;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int number= sc.nextInt();
		long fact= factorial(number);
		System.out.println("Factorial of "+ number +" is: "+ fact);

		sc.close();
	}
	public static long factorial(int n) {
		if (n<=1) {
			return 1;
		}
		return n*factorial(n-1);//formula to calculate factorial
	}
}
