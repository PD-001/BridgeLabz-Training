package functionalinterfaces.interfaces.multivehiclerentalsystem;

public class Main {
	public static void main(String[] args) {
		Cars car= new Cars();
		Bikes bike= new Bikes();
		Buses bus= new Buses();
		
		car.rent();
		car.returnVehicle();
		bike.rent();
		bike.returnVehicle();
		bus.rent();
		bus.returnVehicle();
	}
}
