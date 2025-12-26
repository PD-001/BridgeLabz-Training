public class Product {
   //static variable shared by all products
   private static double discount= 0.0;

   //instance variables
   private final String productID; //final variable to ensure the unique identifier cannot be changed
   private String productName;
   private double price;
   private int quantity;

   //constructor to initialize productName, price, and quantity
   public Product(String productID, String productName, double price, int quantity) {
       this.productID= productID;
       this.productName= productName;
       this.price= price;
       this.quantity= quantity;
   }

   //static method to update the discount percentage
   public static void updateDiscount(double newDiscount) {
       if (newDiscount>=0.0 && newDiscount<=100.0) {
           discount= newDiscount;
       } else {
           System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
       }
   }

   //method to calculate the price after applying the discount
   public double getDiscountedPrice() {
       return price-(price*discount/100);
   }
   //method to display product details
   public void displayProductDetails() {
       //using 'instanceof' to verify the object's type before displaying details
       if (this instanceof Product) {
           System.out.println("Product ID: "+ productID);
           System.out.println("Product Name: "+ productName);
           System.out.println("Price: $"+ price);
           System.out.println("Quantity: "+ quantity);
           System.out.println("Discount: "+ discount + "%");
           System.out.println("Price after Discount: $"+ getDiscountedPrice());
       } else {
           System.out.println("The object is not an instance of the Product class.");
       }
   }
   //getters and setters for instance variables (optional, but recommended for encapsulation)
   public String getProductID() {
       return productID;
   }
   public String getProductName() {
       return productName;
   }
   public void setProductName(String productName) {
       this.productName= productName;
   }
   public double getPrice() {
       return price;
   }
   public void setPrice(double price) {
       this.price= price;
   }
   public int getQuantity() {
       return quantity;
   }
   public void setQuantity(int quantity) {
       this.quantity= quantity;
   }
   public static void main(String[] args) {
       //update the discount for all products
       Product.updateDiscount(10.0); //10% discount
       //create new product instances
       Product product1= new Product("P001", "Laptop", 1200.00, 5);
       Product product2= new Product("P002", "Smartphone", 800.00, 10);
       //Display product details
       product1.displayProductDetails();
       System.out.println();
       product2.displayProductDetails();
   }
}
