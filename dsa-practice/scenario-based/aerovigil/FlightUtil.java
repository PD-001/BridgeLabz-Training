package aerovigil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlightUtil {
	
	final static Map<String, ArrayList<Integer>> flights = new HashMap<>(
		    Map.of(
		        "SpiceJet", new ArrayList<>(Arrays.asList(396,200000)),
		        "Vistara", new ArrayList<>(Arrays.asList(615,300000)),
		        "IndiGo", new ArrayList<>(Arrays.asList(230,250000)),
		        "Air Arabia", new ArrayList<>(Arrays.asList(130,150000))
		        ));
	
	public FlightUtil(String input) throws InvalidFlightException{
		String[] values= input.trim().split("\\:");
		
		validateFlightNumber(values[0]);
		validateFlightName(values[1]);
		validatePassengerCount(Integer.parseInt(values[2]), values[1]);
		
		Flight flight= new Flight(values[0], values[1], Integer.parseInt(values[2]), Double.parseDouble(values[3]));
	}
	
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		Matcher matcher= Pattern.compile("^FL-[\\d]{4}$").matcher(flightNumber);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new InvalidFlightException("The flight number "+ flightNumber +" is invalid");
		}
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		
		for(String flight: flights.keySet()) {
			if(flight.equalsIgnoreCase(flightName)) return true;
		}
		
		throw new InvalidFlightException("The flight name "+ flightName +" is invalid");
		
	}
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		
		if(passengerCount<=0) throw new InvalidFlightException("The passenger count "+ passengerCount +" is invalid for "+ flightName);
		
		for(String flight: flights.keySet()) {
			if(flightName.equalsIgnoreCase(flight)) {
				if(passengerCount<=flights.get(flight).get(0))
					return true;
				else throw new InvalidFlightException("The passenger count "+ passengerCount +" is invalid for "+ flightName);
			}
		}
		
		throw new InvalidFlightException("The passenger count "+ passengerCount +" is invalid for "+ flightName);
		
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		if(currentFuelLevel<0) throw new InvalidFlightException("Invalid fuel level for "+ flightName);
		
		for(String flight: flights.keySet()) {
			if(flightName.equalsIgnoreCase(flight)) {
				if(currentFuelLevel<=flights.get(flight).get(1))
					return flights.get(flight).get(1)-currentFuelLevel ;
				else  throw new InvalidFlightException("Invalid fuel level for "+ flightName);
			}
		}
		
		 throw new InvalidFlightException("Invalid fuel level for "+ flightName);
	}
	
}
