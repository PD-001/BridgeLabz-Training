package generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem{
	public Electronics(String name, double price) {
		super(name, price);
	}
	
	@Override
	public String category() {
		return "Electronics";
	}
}
