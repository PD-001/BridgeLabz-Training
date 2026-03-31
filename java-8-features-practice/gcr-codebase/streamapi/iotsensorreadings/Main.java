package streamapi.iotsensorreadings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Double> readings= new ArrayList<Double>(Arrays.asList(20d,80d,70d,60d,90d));
		
		readings.stream().filter(reading->reading>50d).forEach(System.out::println);
	}
}
