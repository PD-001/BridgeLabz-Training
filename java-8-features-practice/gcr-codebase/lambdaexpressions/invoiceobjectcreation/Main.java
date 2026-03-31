package lambdaexpressions.invoiceobjectcreation;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Integer> ids= new ArrayList<>();
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		
		List<Invoice> invoices= ids.stream().map(Invoice::new).toList();
		
		invoices.stream().forEach(System.out::println);
	}
}
