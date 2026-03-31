package functionalinterfaces.interfaces.digitalpaymentinterfaces;

public class Wallet implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment done through Wallet");

	}

}
