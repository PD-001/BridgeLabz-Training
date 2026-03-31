package generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{
	private List<T> items= new ArrayList<>();

	public List<T> getItems() {
		return items;
	}
	
	public void addItem(T item) {
		items.add(item);	
	}
	
	public static void displayAllItems(List<? extends WarehouseItem> items) {
		for(WarehouseItem item:items) {
			System.out.println(item);
		}
	}
}
