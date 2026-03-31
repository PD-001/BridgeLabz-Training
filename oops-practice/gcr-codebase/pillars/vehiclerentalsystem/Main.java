package vehiclerentalsystem;

public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicles= {
				new Car("CAR123", 1500, "INS-CAR-001"),
				new Bike("BIKE456", 500, "INS-BIKE-002"),
				new Truck("TRUCK789", 3000, "INS-TRUCK-003")
		};

		int rentalDays= 5;

		for (Vehicle vehicle:vehicles) {
			double rentalCost= vehicle.calculateRentalCost(rentalDays);
			System.out.println("Vehicle Type: "+ vehicle.getType());
			System.out.println("Vehicle Number: "+ vehicle.getVehicleNumber());
			System.out.println("Rental Cost for "+ rentalDays +" days: ₹"+ rentalCost);

			if (vehicle instanceof Insurable) {
				Insurable insurable= (Insurable) vehicle;
				double insuranceCost= insurable.calculateInsurance();
				System.out.println("Insurance Cost: ₹"+ insuranceCost);
				System.out.println(insurable.getInsuranceDetails());
			} else {
				System.out.println("Insurance: Not Available for "+ vehicle.getType());
			}

		}
	}
}
