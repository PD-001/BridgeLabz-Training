package generics.dynamiconlinemarketplace;

public class GadgetsCategory implements Category {

	@Override
	public double minPrice() {
		return 1000;
	}

	@Override
	public double maxPrice() {
		return 10000;
	}

}
