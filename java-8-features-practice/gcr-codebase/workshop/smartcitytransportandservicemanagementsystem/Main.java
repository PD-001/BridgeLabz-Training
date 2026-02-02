package smartcitytransportandservicemanagementsystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		TransportService bus= new BusService(GeoUtils.calculateDistance("A", "C"), Arrays.asList(new Passenger("Anubhav"), new Passenger("Prakash"), new Passenger("Sahil")));
		
		TransportService metro= new MetroService(GeoUtils.calculateDistance("A", "E"), Arrays.asList(new Passenger("Pushpak"),new Passenger("Divanshu")));
		
		TransportService taxi= new TaxiService(GeoUtils.calculateDistance("B", "C"), Arrays.asList(new Passenger("Ayush")));
		
		TransportService ambulance= new AmbulanceService();
		
		List<TransportService> services= Arrays.asList(bus,metro,taxi,ambulance);
		
		System.out.println("Filtered and sortes services:");
		
		services.stream().filter(s->s.getFare()<=60)
			.sorted(Comparator.comparing(TransportService::getFare))
			.forEach(TransportService::printServiceDetails);
		
		System.out.println();
		System.out.println("Live Dashboard");
		services.forEach(TransportService::printServiceDetails);
		
		Map<String, List<Passenger>> passengerByService= services.stream()
																.collect(Collectors.groupingBy(TransportService::getServicename, 
																			Collectors.flatMapping(s->s.getNoOfPassenger().stream(), Collectors.toList())
																		));
		passengerByService.forEach((k,v)->System.out.println(k+"->"+v));
		
		FareCalculator rideFareCalculator = service->service.getFare()*service.getDistance();
		
		System.out.println();
		System.out.println("Ride Fare With Passengers");

		services.forEach(service -> {

		    double rideFare = rideFareCalculator.calculateFare(service);

		    System.out.println("\nService: " + service.getServicename());
		    System.out.println("Base Fare: " + service.getFare());
		    System.out.println("Distance: " + service.getDistance());
		    System.out.println("Total Ride Fare: " + rideFare);
		    System.out.println("Passengers:");

		    service.getNoOfPassenger().stream()
		           .forEach(p -> System.out.println(" - " + p));
		});
		
		System.out.println("\nEmergency Priority Services");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                    System.out.println(s.getServicename() +
                    " → Traffic rules bypassed")
                );
		
	}
}
