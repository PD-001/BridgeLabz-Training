package ridemanagementsystem;

public class Peak implements FareCalculator{

	@Override
	public double calculateFare(double distance) {
		return distance*80;
	}

}
