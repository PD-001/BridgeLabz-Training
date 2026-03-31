package regexandjunit.junit.performancetesting;

public class MethodWaits3Seconds {
	public boolean longRunningTask() throws InterruptedException {
		Thread.sleep(3000);;
		return true;
	}
}
