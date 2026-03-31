package generics.dynamiconlinemarketplace;

public class BookCategory implements Category{

	@Override
	public double minPrice() {
		return 100;
	}

	@Override
	public double maxPrice() {
		return 2000;
	}

}
