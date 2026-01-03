package generics.dynamiconlinemarketplace;

public class ClothingCategory implements Category {

	@Override
	public double minPrice() {
		return 300;
	}

	@Override
	public double maxPrice() {
		return 5000;
	}

}
