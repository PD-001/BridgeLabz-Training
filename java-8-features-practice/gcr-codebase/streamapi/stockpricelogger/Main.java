package streamapi.stockpricelogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StockPrice{
	
	private String name;
	private double price;
	
	public StockPrice(String name, double price) {
		this.name= name;
		this.price= price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price= price;
	}

	@Override
	public String toString() {
		return "StockPrice Name=" + name + ", Price=" + price ;
	}
}

public class Main {
	public static void main(String[] args) {
		List<StockPrice> stocks= new ArrayList<>(
					Arrays.asList(
						new StockPrice("HCL", 12000),
						new StockPrice("Nifty50", 86000),
						new StockPrice("Sensex", 55000),
						new StockPrice("Tata Motors", 60000),
						new StockPrice("Reliance", 78000)
					)
				);
		
		stocks.stream().forEach(System.out::println);
		
	}
}
