package vehiclerentalsystem;

abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	private String insurancePolicyNumber;

	public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		this.vehicleNumber= vehicleNumber;
		this.type= type;
		this.rentalRate= rentalRate;
		this.insurancePolicyNumber= insurancePolicyNumber;
	}

	//encapsulation: Getters & Setters
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber= vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}

	public void setInsurancePolicyNumber(String insurancePolicyNumber) {
		this.insurancePolicyNumber= insurancePolicyNumber;
	}

	//abstract Method
	public abstract double calculateRentalCost(int days);
}
