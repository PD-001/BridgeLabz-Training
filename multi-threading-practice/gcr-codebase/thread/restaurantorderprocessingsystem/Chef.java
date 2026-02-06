package thread.restaurantorderprocessingsystem;

public class Chef implements Runnable {

	private String chefStation;
	private String chefName;
	private int timeRequired;
	
	public Chef(String chefStation, String chefName) {
		this.chefStation= chefStation;
		this.chefName= chefName;
		switch(chefStation.toLowerCase()) {
			case "pizza":
				this.timeRequired=3000;
				break;
			case "pasta":
				this.timeRequired=2000;
				break;
			case "salad":
				this.timeRequired=1000;
				break;
			case "burger":
				this.timeRequired=2500;
				break;
			default:
				System.out.println("Please enter valid station");
		}
	}
	
	@Override
	public void run() {

		System.out.println("Chef ["+ chefName +"] started preparing ["+ chefStation +"]");
		
		try {
			for(int i=25;i<=100;i+=25) {
				System.out.println("Completion Rate for "+ chefStation +" :"+ i +"%");
				Thread.sleep(timeRequired/4);
			}
			
		}catch(InterruptedException e) {
			System.out.println("Interrupted: "+e.getMessage());
		}
		
	}
	
}
