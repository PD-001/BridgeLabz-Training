package generics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem{
	public Groceries(String name, double price) {
		super(name,price);
	}
	
	@Override
	public String category() {
		return "Groceries";
	}
}
