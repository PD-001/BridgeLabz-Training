public class PayableFee {
    public static void main(String[] args) {
        int fee=125000;
        double discountPercent=10;
        double discount= (fee * discountPercent)/100;// calculating discount amount
        double payableFee= fee - discount;// calculating payable fee after discount
        System.out.println("The siacount amount is INR "+ discount +" and discounted fee is INR "+ payableFee +".");
    }
}
