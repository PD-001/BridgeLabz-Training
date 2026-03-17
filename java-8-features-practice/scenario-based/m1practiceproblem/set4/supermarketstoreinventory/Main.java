package m1practiceproblem.set4.supermarketstoreinventory;

import java.util.*;

abstract class Product {
	
	String name;
	double price;
	int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name= name;
		this.price= price;
		this.quantity= quantity;
	}
	
	abstract void display();
	
	public double total() {
		return price*quantity;
	}
}

class Electronics extends Product {
	
	int warranty;
	
	public Electronics(String name, double price, int quantity, int warranty) {
		super(name, price, quantity);
		this.warranty= warranty;
	}
	
	void display() {
		
		System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Warranty: "+warranty+" months");
	}
}

class Clothing extends Product {
	
	String size;
	
	public Clothing(String name, double price, int quantity, String size) {
		super(name, price, quantity);
		this.size= size;
	}
	
	void display() {
		
		System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Size: "+size);
	}
}

public class Main {
	
	static ArrayList<Product> list= new ArrayList<>();
	
	public static void addProduct(String line) {
		
		String[] arr= line.split(",\\s*");
		
		String type= arr[0];
		
		if(type.equalsIgnoreCase("Electronics")) {
			
			Product p= new Electronics(
					arr[1],
					Double.parseDouble(arr[2]),
					Integer.parseInt(arr[3]),
					Integer.parseInt(arr[4]));
			
			list.add(p);
			System.out.println("Product added to inventory: "+arr[1]);
		}
		
		else {
			
			Product p= new Clothing(
					arr[1],
					Double.parseDouble(arr[2]),
					Integer.parseInt(arr[3]),
					arr[4]);
			
			list.add(p);
			System.out.println("Product added to inventory: "+arr[1]);
		}
	}
	
	public static void displayInventory() {
		
		System.out.println("Inventory:");
		
		for(Product p: list) {
			p.display();
		}
	}
	
	public static void totalValue() {
		
		double sum=0;
		
		for(Product p: list) {
			sum+=p.total();
		}
		
		System.out.printf("Total value of the inventory: %.2f\n", sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		int count=0;
		
		while(count<n) {
			
			String line= sc.nextLine();
			
			if(line.trim().length()==0) continue;
			
			addProduct(line);
			count++;
		}
		
		displayInventory();
		totalValue();
	}
}