package generics.dynamiconlinemarketplace;

public abstract class Product<T extends Category> {
	
	private String name;
	private double price;
	private T category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		validate(price, category);
		this.price= price;
	}
	public T getCategory() {
		return category;
	}
	public void setCategory(T category) {
		this.category= category;
	}
	
	protected Product(String name, double price, T category) {
		validate(price,category);
		setCategory(category);
		setName(name);
		setPrice(price);
	}
	
	private void validate(double price, T category) {
		if(price>category.maxPrice() || price<category.minPrice()) {
			throw new IllegalArgumentException("Invalid price for category");
		}
	}
	

	
}
