package functionalinterfaces.interfaces.smartdevicecontrolinterface;

public class AC implements Power {
	
	@Override
	public void turnOn() {
		System.out.println("AC turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("AC turned off");
	}
	
}
