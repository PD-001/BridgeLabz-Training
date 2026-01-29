package functionalinterfaces.defaultmethodsininterfaces.paymentgatewayintegration;

public class Paytm implements PaymentProcessor{

	@Override
	public void pay(double money) {
		System.out.println("Payment made through Paytm");
	}
	
	@Override
	public void refund() {
		System.out.println("Refunded through Paytm");
	}
	
	
	
}
