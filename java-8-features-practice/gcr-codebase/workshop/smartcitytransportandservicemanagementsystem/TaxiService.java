package smartcitytransportandservicemanagementsystem;

import java.util.List;

public class TaxiService implements TransportService{

	private double distance;
	private List<Passenger> noOfPassengers;
	
	String[] scheduledPath= new String[]{"A","B" };
	
	public TaxiService(double distance, List<Passenger> noOfPassengers) {
		this.distance = distance;
		this.noOfPassengers = noOfPassengers;
	}
	
	@Override
	public String getServicename() {
		return "Taxi service";
	}

	@Override
	public double getFare() {
		return 80;
	}
	
	@Override
	public double getDistance() {
		return distance;
	}

	@Override
	public List<Passenger> getNoOfPassenger() {
		return noOfPassengers;
	}

}
