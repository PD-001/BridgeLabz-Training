package methods;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();

		if (isPrime(number)) {
			System.out.println(number +" is a prime number.");
		}
		else {
			System.out.println(number +" is not a prime number.");
		}

		sc.close();
	}
	public static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0) {//if divisible than not prime
				return false;
			}
		}
		return true;
	}

}
