package vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {
	public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate()*days;
	}

	@Override
	public double calculateInsurance() {
		return 1000.0; //fixed insurance for bikes
	}

	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance Policy No: "+ getInsurancePolicyNumber();
	}
}