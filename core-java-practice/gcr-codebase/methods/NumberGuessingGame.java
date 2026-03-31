package methods;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static int generateGuess(int low, int high) {
		Random rand= new Random();
		return low+rand.nextInt(high-low+1);
	}

	public static String getFeedback(Scanner sc) {
		System.out.print("Enter feedback (high / low / correct): ");
		return sc.next().toLowerCase();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int low= 1;
		int high= 100;
		boolean guessed= false;

		System.out.println("Think of a number between 1 and 100.");

		while (!guessed) {
			int guess= generateGuess(low, high);
			System.out.println("My guess is: " + guess);

			String feedback= getFeedback(sc);

			if (feedback.equals("high")) {
				high= guess-1;
			}
			else if (feedback.equals("low")) {
				low= guess+1;
			}
			else if (feedback.equals("correct")) {
				System.out.println("Yay! I guessed your number correctly.");
				guessed= true;
			}
			else {
				System.out.println("Invalid feedback. Please enter high, low, or correct.");
			}
		}

		sc.close();
	}
}
