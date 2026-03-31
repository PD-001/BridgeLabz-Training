package aerovigil;

import java.util.Scanner;

public class UserInteface {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter flight details in format:<FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuelLevel>");
		
		String input= sc.nextLine();
		
		try {
			FlightUtil util= new FlightUtil(input);
			double requiredFuel= util.calculateFuelToFillTank(input.trim().split("\\:")[1],Double.parseDouble(input.trim().split("\\:")[3]) );
			System.out.printf("Fuel required to fill the tank: %.1f liters", requiredFuel);
		}
		catch(InvalidFlightException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
