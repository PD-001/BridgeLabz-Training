package ridemanagementsystem;

public class Normal implements FareCalculator{

	@Override
	public double calculateFare(double distance) {
		return distance*60;
	}
	
}
