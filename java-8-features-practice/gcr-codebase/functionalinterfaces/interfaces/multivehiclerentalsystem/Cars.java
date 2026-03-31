package functionalinterfaces.interfaces.multivehiclerentalsystem;

public class Cars implements RentService {

	@Override
	public void rent() {
		System.out.println("Car rented");

	}

	@Override
	public void returnVehicle() {
		System.out.println("Car returned");

	}

}
