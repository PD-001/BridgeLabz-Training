package ridemanagementsystem;

public class Main {
	public static void main(String[] args) {
		RideSystem ridesystem= new RideSystem();
		
		Driver driver1= new Driver(1,"Pushpak");
		Driver driver2= new Driver(1,"Prakash");
		
		ridesystem.addDriver(driver1);
		ridesystem.addDriver(driver2);
		
		User user= new User(1,"Anubhav");
		User user2= new User(2,"Sahil");
		User user3= new User(3,"Divanshu");
		
		FareCalculator fcN= new Normal();
		FareCalculator fcP= new Peak();
		
		try {
			ridesystem.addRide(1, user, 10, fcN);
			ridesystem.addRide(2, user2, 9, fcP);
			ridesystem.addRide(3, user3, 11, fcN);
		}
		catch(NoDriverAvailableException e){
			System.out.println(e.getMessage());
		}
	}
}
