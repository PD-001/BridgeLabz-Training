import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double unitPrice= sc.nextDouble();
        double quantity= sc.nextDouble();
        double totalPrice= unitPrice * quantity;// calculating total price

        System.out.println("The total purchase price is INR "+ totalPrice +" if the quantity is "+ quantity +" and unit price is INR "+ unitPrice +".");
        sc.close();
    }
}
