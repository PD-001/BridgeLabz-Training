package functionalinterfaces.interfaces.smartdevicecontrolinterface;

public class Main {
	public static void main(String[] args) {
		Lights light=new Lights();
		AC ac= new AC();
		TV tv= new TV();
		
		light.turnOn();
		ac.turnOn();
		tv.turnOn();
		light.turnOff();
		ac.turnOff();
		tv.turnOff();
	}
}
