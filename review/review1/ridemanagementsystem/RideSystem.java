package ridemanagementsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RideSystem {
	HashMap<Integer,Ride> hm= new HashMap<>();
	Queue<Driver> queue= new LinkedList<>();
	
	public void addDriver(Driver driver) {
		queue.offer(driver);
	}
	
	public void addRide(int rideId, User user, double distance, FareCalculator fareCal) throws NoDriverAvailableException {
		if(queue.isEmpty()) {
			throw new NoDriverAvailableException("No driver avalaible");
		}
		Driver driver= queue.poll();
		double fare= fareCal.calculateFare(distance);
		
		Ride ride= new Ride(rideId,driver,user,fare);
		hm.put(rideId, ride);
		System.out.println("Ride booked");
		System.out.println("User:"+ user.userId +"-"+ user.name +" with driver:"+ driver.driverId +"-"+ driver.name +", rideId:"+ ride.rideId +" and fare:"+ ride.fare);
	}
}
