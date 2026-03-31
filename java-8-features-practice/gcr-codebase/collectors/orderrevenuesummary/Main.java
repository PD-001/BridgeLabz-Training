package collectors.orderrevenuesummary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    public Order(String customer, double amount) {
        this.customer= customer;
        this.amount= amount;
    }
}


public class Main {
	public static void main(String[] args) {
		
		List<Order> orders= new ArrayList<>(
					Arrays.asList(
							new Order("Prakash", 1200.50),
						    new Order("Anubhav", 800.00),
						    new Order("Prakash", 500.00),
						    new Order("Sahil", 300.75),
						    new Order("Anubhav", 200.25)
							)
				);
		
		Map<String, Double> sumPerCustomer= 
				orders.stream()
					.collect(Collectors.groupingBy(o->o.customer, Collectors.summingDouble(o->o.amount)));
		
		System.out.println(sumPerCustomer);
		
	}
}
