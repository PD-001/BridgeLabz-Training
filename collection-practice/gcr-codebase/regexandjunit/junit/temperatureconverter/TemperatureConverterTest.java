package regexandjunit.junit.temperatureconverter;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

	TemperatureConverter tc= new TemperatureConverter();
	
	@Test
	void testCelsiusToFahrenheit() {
		assertEquals(32, tc.celsiusToFahrenheit(0));
		assertEquals(212, tc.celsiusToFahrenheit(100));
	}

	@Test
	void testFahrenheitToCelsius() {
		assertEquals(0, tc.fahrenheitToCelsius(32));
		assertEquals(100, tc.fahrenheitToCelsius(212));
	}
}