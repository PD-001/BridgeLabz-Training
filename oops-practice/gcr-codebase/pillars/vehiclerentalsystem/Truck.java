package vehiclerentalsystem;

class Truck extends Vehicle {
	public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		//rental cost + extra charge per day
		return getRentalRate()*days+2000.0; //extra fixed maintenance charge
	}
}