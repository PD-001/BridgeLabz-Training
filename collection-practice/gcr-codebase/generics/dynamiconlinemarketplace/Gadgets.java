package generics.dynamiconlinemarketplace;

public class Gadgets extends Product<GadgetsCategory>{

	protected Gadgets(String name, double price, GadgetsCategory category) {
		super(name, price, new GadgetsCategory());
	}

}
