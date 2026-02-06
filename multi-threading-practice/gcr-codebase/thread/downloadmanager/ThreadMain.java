package thread.downloadmanager;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new FileDownloader("Documnet.pdf"));
		Thread t2= new Thread(new FileDownloader("Image.jpg"));
		Thread t3= new Thread(new FileDownloader("Video.mp4"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("All downloads complete!");
		
	}
}
