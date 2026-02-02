package smartcitytransportandservicemanagementsystem;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		TransportService bus= new BusService(GeoUtils.calculateDistance("A", "C"), Arrays.asList(new Passenger("Anubhav"), new Passenger("Prakash"), new Passenger("Sahil")));
		
	}
}
