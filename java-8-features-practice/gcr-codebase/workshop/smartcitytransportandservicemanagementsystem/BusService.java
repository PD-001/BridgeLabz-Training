package smartcitytransportandservicemanagementsystem;

import java.util.List;

public class BusService implements TransportService{

	private double distance;
	private List<Passenger> noOfPassengers;
	
	String[] scheduledPath= new String[]{"A", "C","E" };
	
	public BusService(double distance, List<Passenger> noOfPassengers) {
		this.distance = distance;
		this.noOfPassengers = noOfPassengers;
	}
	
	@Override
	public String getServicename() {
		return "Bus service";
	}

	@Override
	public double getFare() {
		return 50;
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
