package functionalinterfaces.interfaces.multivehiclerentalsystem;

public class Buses implements RentService {

	@Override
	public void rent() {
		System.out.println("Bus rented");

	}

	@Override
	public void returnVehicle() {
		System.out.println("Bus returned");

	}

}
