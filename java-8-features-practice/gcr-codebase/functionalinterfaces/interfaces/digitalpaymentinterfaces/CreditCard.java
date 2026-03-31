package functionalinterfaces.interfaces.digitalpaymentinterfaces;

public class CreditCard implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment done through Credit Card");

	}

}
