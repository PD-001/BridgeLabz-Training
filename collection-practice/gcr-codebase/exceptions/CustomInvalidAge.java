package exceptions;

import java.util.Scanner;

public class CustomInvalidAge {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		try {
			validateAge(age);
		} 
		catch (InvalidAgeException e) {
			System.out.println("Error:"+ e.getMessage());
		}
		sc.close();
	}
	
	public static void validateAge(int age) throws InvalidAgeException {
		if(age>=18) System.out.println("Access granted!");
		else {
			throw new InvalidAgeException("Age must be 18 or above");
		}
	}
}

class InvalidAgeException extends Throwable{
	InvalidAgeException(String message){
		super(message);
	}
}