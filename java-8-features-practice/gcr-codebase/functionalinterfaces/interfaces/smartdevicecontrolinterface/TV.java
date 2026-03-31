package functionalinterfaces.interfaces.smartdevicecontrolinterface;

public class TV implements Power {

	@Override
	public void turnOn() {
		System.out.println("TV turned on");

	}

	@Override
	public void turnOff() {
		System.out.println("TV turned off");

	}

}
