package generics.dynamiconlinemarketplace;

public class DiscountService {
	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		if(percentage<=0||percentage>50) {
			throw new IllegalArgumentException("Invalid discount");
		}
		double discountedPrice= product.getPrice()-(product.getPrice()*percentage/100);
		product.setPrice(discountedPrice);
	}
}
