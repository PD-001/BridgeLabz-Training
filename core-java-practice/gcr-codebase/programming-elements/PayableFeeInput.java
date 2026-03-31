import java.util.Scanner;

public class PayableFeeInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fee=sc.nextInt();
        double discountPercent=sc.nextDouble();

        double discount= (fee * discountPercent)/100;// calculating discount amount
        double payableFee= fee - discount;// calculating payable fee after discount
        
        System.out.println("The siacount amount is INR "+ discount +" and discounted fee is INR "+ payableFee +".");
        sc.close();
    }
}
