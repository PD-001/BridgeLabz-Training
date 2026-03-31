package thread.downloadmanager;

public class RunnableMain {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(new FileDownloaderRunnable("Documnet.pdf"),"Thread-1");
		Thread t2= new Thread(new FileDownloaderRunnable("Image.jpg"),"Thread-2");
		Thread t3= new Thread(new FileDownloaderRunnable("Video.mp4"),"Thread-3");
		
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
	}
}
