package functionalinterfaces.interfaces.smartdevicecontrolinterface;

public class Lights implements Power {

	@Override
	public void turnOn() {
		System.out.println("Light turned on");

	}

	@Override
	public void turnOff() {
		System.out.println("Light turned off");

	}

}
