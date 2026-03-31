package functionalinterfaces.defaultmethodsininterfaces.smartvehicledashboard;

@FunctionalInterface
public interface Features {
	
	public void displaySpeed();
	
	default void battery() {
		System.out.println("Battery Percentage");
	}
	
}
