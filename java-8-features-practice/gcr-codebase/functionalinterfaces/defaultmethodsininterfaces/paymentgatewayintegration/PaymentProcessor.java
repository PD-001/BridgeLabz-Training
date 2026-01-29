package functionalinterfaces.defaultmethodsininterfaces.paymentgatewayintegration;

@FunctionalInterface
public interface PaymentProcessor {
	
	public abstract void pay(double money);
	
	default void refund() {
		System.out.println("Payment refunded.");
	}
	
}
