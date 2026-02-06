package thread.downloadmanager;

import java.util.Random;

public class FileDownloader extends Thread{

	String filename;
	Random random;
	
	public FileDownloader(String filename) {
		this.filename= filename;
		this.random= new Random();
	}
	
	public void run() {
		try {
			for(int i=0;i<100;i+=5) {
				System.out.println("["+ Thread.currentThread().getName() +"] Downloading "+ filename +": "+ i +"%");
				Thread.sleep(200+ random.nextInt(200));
			}
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted: "+ e.getMessage());
		}
	}
	
}
