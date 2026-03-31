package smartcitytransportandservicemanagementsystem;

import java.util.List;

public class MetroService implements TransportService{

	private double distance;
	private List<Passenger> noOfPassengers;
	
	String[] scheduledPath= new String[]{"A","B", "C","D","E" };
	
	public MetroService(double distance, List<Passenger> noOfPassengers) {
		this.distance = distance;
		this.noOfPassengers = noOfPassengers;
	}
	
	@Override
	public String getServicename() {
		return "Metro service";
	}

	@Override
	public double getFare() {
		return 40;
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
