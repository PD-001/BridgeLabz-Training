package thread.restaurantorderprocessingsystem;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(new Chef("Pizza", "Anubhav"),"t1");
		Thread t2= new Thread(new Chef("Pasta", "Prakash"),"t2");
		Thread t3= new Thread(new Chef("Burger", "Sahil"),"t3");
		Thread t4= new Thread(new Chef("Salad", "Pushpak"),"t4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("Kitchen closed- All orders completed");
	}
}
