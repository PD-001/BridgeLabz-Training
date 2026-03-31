package thread.printshopjobscheduler;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		long startTime= System.currentTimeMillis();

		System.out.println("Starting print jobs...");

		PrintJob j1= new PrintJob("Job1", 10, 5);
		PrintJob j2= new PrintJob("Job2", 5, 8);

		Thread t1= new Thread(j1, "Thread-Job1");
		Thread t2= new Thread(j2, "Thread-Job2");

		t1.setPriority(j1.getPriority());
		t2.setPriority(j2.getPriority());

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		long endTime= System.currentTimeMillis();

		System.out.println("All jobs completed in "+ (endTime-startTime) +"ms");
	}

}
