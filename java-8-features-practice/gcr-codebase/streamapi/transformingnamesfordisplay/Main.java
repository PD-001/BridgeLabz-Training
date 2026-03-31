package streamapi.transformingnamesfordisplay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> customerNames= new ArrayList<>(Arrays.asList("Prakash","Pushpak","Anubhav","Sahil","Divanshu"));
		
		customerNames.stream()
			.map(customerName->customerName.toUpperCase())
			.sorted()
			.forEach(System.out::println);
		
	}
}
