package smartcitytransportandservicemanagementsystem;

import java.util.List;

public interface TransportService {
	
	String getServicename();
	double getDistance();
	List<Passenger> getNoOfPassenger();
	double getFare();
	
	default void printServiceDetails() {
		System.out.println(getServicename()+", Fare-"+ getFare() +", Distance-" + getDistance() +", Passengers-");
		getNoOfPassenger().forEach(System.out::println);
	}
}
