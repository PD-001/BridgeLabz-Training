
public class Product {

	//instance variables
	String productName;
	double price;

	//class variable
	static int totalProducts= 0;

	//parameterized constructor
	Product(String productName, double price) {
		this.productName= productName;
		this.price= price;
		totalProducts++; //increment total products count
	}

	//instance method to display product details
	public void displayProductDetails() {
		System.out.println("Product Name: "+ productName);
		System.out.println("Product Price: "+ price);
	}

	//class method to display total products
	public static void displayTotalProducts() {
		System.out.println("Total Products Created: "+ totalProducts);
	}

	public static void main(String[] args) {

		//creating product objects
		Product p1= new Product("Laptop", 65000);
		Product p2= new Product("Mobile", 30000);
		Product p3= new Product("Headphones", 2500);

		//displaying product details
		p1.displayProductDetails();
		System.out.println();

		p2.displayProductDetails();
		System.out.println();

		p3.displayProductDetails();
		System.out.println();

		//displaying total products
		displayTotalProducts();
	}
}
