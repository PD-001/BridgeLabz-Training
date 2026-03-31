package regexandjunit.junit.performancetesting;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class MethodWaits3SecondTest {
	
	MethodWaits3Seconds toTest= new MethodWaits3Seconds();
	
	@Test
	@Timeout(value= 2, unit= TimeUnit.SECONDS)
	void testFunction() throws InterruptedException {
		toTest.longRunningTask();
	}
}
