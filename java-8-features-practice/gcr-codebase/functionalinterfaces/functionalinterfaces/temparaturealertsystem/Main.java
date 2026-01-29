package functionalinterfaces.functionalinterfaces.temparaturealertsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Double> temperatures= new ArrayList<Double>(Arrays.asList(26.3, 34.5, 65.0));
		
		Predicate<Double> predicate= (temp)->temp>30;
		
		temperatures.stream().filter(predicate).forEach(System.out::println);
	}
}
