package methods;

import java.util.Scanner;

public class FibonacciSeqGenerator {

	public static void genFibonacci(int n) {
		int first= 0;
		int second= 1;

		System.out.print("Fibonacci Sequence: ");

		for (int i=0; i<n; i++) {
			System.out.print(first + " ");
			int next= first + second;
			first= second;
			second= next;
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int terms= sc.nextInt();

		genFibonacci(terms);

		sc.close();
	}
}
