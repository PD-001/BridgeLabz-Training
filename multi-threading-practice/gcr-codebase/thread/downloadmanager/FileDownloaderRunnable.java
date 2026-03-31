package thread.downloadmanager;

import java.util.Random;

public class FileDownloaderRunnable implements Runnable{

	String fileName;
	Random random;
	
	public FileDownloaderRunnable(String filename) {
		this.fileName= filename;
		random= new Random();
	}
	
	@Override
	public void run() {
		
		try {
			for(int i=0;i<100;i+=5) {
				System.out.println("["+ Thread.currentThread().getName() +"] Downloading "+ fileName +": "+ i);
				Thread.sleep(200+random.nextInt(200));
			}
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted: "+ e.getMessage());
		}
		
	}
	
	
	
}
