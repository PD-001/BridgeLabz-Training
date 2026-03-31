package generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
	private String name;
	private double price;
	
	public WarehouseItem(String name, double price) {
		setName(name);
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String category();
//	
//	@Override
//	public String toString() {
//		return "Name "+ getName() +" and price "+ getPrice();
//	}

}
