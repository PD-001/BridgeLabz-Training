package aerovigil;

public class Flight {
	
	private String flightNumber;
	private String flightName;
	private int passengerCount;
	private double currentFuelLevel;
	
	public Flight(String flightNumber, String flightName, int passengerCount, double currentFuelLevel) {
		super();
		this.flightNumber= flightNumber;
		this.flightName= flightName;
		this.passengerCount= passengerCount;
		this.currentFuelLevel= currentFuelLevel;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber= flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName= flightName;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount= passengerCount;
	}

	public double getCurrentFuelLevel() {
		return currentFuelLevel;
	}

	public void setCurrentFuelLevel(double currentFuelLevel) {
		this.currentFuelLevel= currentFuelLevel;
	}
	
	@Override
	public String toString() {
		return "Flight Number : "+ flightNumber +
				"\nFlight Name : "+ flightName +
				"\nPassenger Count : "+ passengerCount +
				"\nCurrent Fuel Level : "+ currentFuelLevel;
	}
	
}
