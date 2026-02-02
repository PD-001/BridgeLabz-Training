package smartcitytransportandservicemanagementsystem;

import java.util.Arrays;
import java.util.List;

public class AmbulanceService implements TransportService, EmergencyService{
	
	@Override
    public String getServicename() {
        return "Ambulance Service";
    }

    @Override
    public double getDistance() {
        return 20;
    }

    @Override
    public List<Passenger> getNoOfPassenger() {
        return Arrays.asList(new Passenger("Critical Patient"));
    }

    @Override
    public double getFare() {
        return 0;
    }
	
}
