package trafficmanager;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		TrafficManager manager= new TrafficManager();
		
		LinkedList<String> vehicles= new LinkedList<>();
		vehicles.add("UP-80-ZX07");
		vehicles.add("UP-80-AW11");
		vehicles.add("UP-80-DF42");
		vehicles.add("UP-80-NM90");
		vehicles.add("UP-80-ZX07");
		
		manager.vehiclesForRoundabout(vehicles);
		manager.vehiclesInRoundAbout();
	}
}
