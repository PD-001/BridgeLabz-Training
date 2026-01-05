package ridemanagementsystem;

public class Ride {
	int rideId;
	Driver driver;
	User user;
	double fare;
	
	public Ride(int rideId, Driver driver, User user, double fare) {
		this.rideId= rideId;
		this.driver= driver;
		this.user= user;
		this.fare= fare;
	}
}
