package functionalinterfaces.interfaces.digitalpaymentinterfaces;

public class Main {
	public static void main(String[] args) {
		UPI upi= new UPI();
		CreditCard creditcard= new CreditCard();
		Wallet wallet= new Wallet();
		
		upi.pay();
		creditcard.pay();
		wallet.pay();
	}
}
