package thread.threadstatemonitoringsystem;

public class TaskRunner implements Runnable{
	
	String task;
	
	public TaskRunner(String task) {
		this.task= task;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
			
			for(int i=0;i<100000;i++) {
				Math.sqrt(i);
			}
			
		}catch(InterruptedException e) {
			
			System.out.println("Interrupted: "+ e.getMessage());
			
		}
		
	}
	
}
