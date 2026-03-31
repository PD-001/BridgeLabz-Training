class ItemNode {
	int itemId;
	String itemName;
	int quantity;
	double price;
	ItemNode next;

	ItemNode(int itemId,String itemName,int quantity,double price) {
		this.itemId= itemId;
		this.itemName= itemName;
		this.quantity= quantity;
		this.price= price;
		this.next= null;
	}
}

public class InventoryManagementSystem {

	private ItemNode head;

	//add at beginning
	public void addAtBeginning(int itemId,String itemName,int quantity,double price) {
		ItemNode newNode= new ItemNode(itemId,itemName,quantity,price);
		newNode.next= head;
		head= newNode;
	}

	//add at end
	public void addAtEnd(int itemId,String itemName,int quantity,double price) {
		ItemNode newNode= new ItemNode(itemId,itemName,quantity,price);

		if (head==null) {
			head= newNode;
			return;
		}

		ItemNode temp= head;
		while (temp.next!=null) {
			temp= temp.next;
		}
		temp.next= newNode;
	}

	//remove by item id
	public void removeByItemId(int itemId) {
		if (head==null) {
			return;
		}

		if (head.itemId==itemId) {
			head= head.next;
			return;
		}

		ItemNode temp= head;
		while (temp.next!=null && temp.next.itemId!=itemId) {
			temp= temp.next;
		}

		if (temp.next!=null) {
			temp.next= temp.next.next;
		}
	}

	//update quantity
	public void updateQuantity(int itemId,int newQuantity) {
		ItemNode temp= head;

		while (temp!=null) {
			if (temp.itemId==itemId) {
				temp.quantity= newQuantity;
				return;
			}
			temp= temp.next;
		}
	}

	//search by id
	public void searchByItemId(int itemId) {
		ItemNode temp= head;

		while (temp!=null) {
			if (temp.itemId==itemId) {
				displayItem(temp);
				return;
			}
			temp= temp.next;
		}
	}

	//search by name
	public void searchByItemName(String itemName) {
		ItemNode temp= head;

		while (temp!=null) {
			if (temp.itemName.equalsIgnoreCase(itemName)) {
				displayItem(temp);
			}
			temp= temp.next;
		}
	}

	//calculate total value
	public void calculateTotalValue() {
		double total= 0;
		ItemNode temp= head;

		while (temp!=null) {
			total+= temp.price*temp.quantity;
			temp= temp.next;
		}
		System.out.println("Total Inventory Value: "+total);
	}

	//simple sort by name
	public void sortByName() {
		ItemNode i,j;

		for (i=head;i!=null;i=i.next) {
			for (j=i.next;j!=null;j=j.next) {
				if (i.itemName.compareToIgnoreCase(j.itemName)>0) {
					swapData(i,j);
				}
			}
		}
	}

	//simple sort by price
	public void sortByPrice() {
		ItemNode i,j;

		for (i=head;i!=null;i=i.next) {
			for (j=i.next;j!=null;j=j.next) {
				if (i.price>j.price) {
					swapData(i,j);
				}
			}
		}
	}

	//swap data
	private void swapData(ItemNode a,ItemNode b) {
		int id= a.itemId;
		String name= a.itemName;
		int qty= a.quantity;
		double price= a.price;

		a.itemId= b.itemId;
		a.itemName= b.itemName;
		a.quantity= b.quantity;
		a.price= b.price;

		b.itemId= id;
		b.itemName= name;
		b.quantity= qty;
		b.price= price;
	}

	//display inventory
	public void displayInventory() {
		ItemNode temp= head;

		while (temp!=null) {
			displayItem(temp);
			temp= temp.next;
		}
	}

	private void displayItem(ItemNode item) {
		System.out.println("Item ID: "+item.itemId);
		System.out.println("Item Name: "+item.itemName);
		System.out.println("Quantity: "+item.quantity);
		System.out.println("Price: "+item.price);
		System.out.println();
	}

	public static void main(String[] args) {

		InventoryManagementSystem inventory= new InventoryManagementSystem();

		inventory.addAtEnd(101,"Laptop",5,50000);
		inventory.addAtEnd(102,"Mouse",20,500);
		inventory.addAtBeginning(103,"Keyboard",10,1500);

		inventory.displayInventory();

		inventory.updateQuantity(102,30);
		inventory.searchByItemId(101);

		inventory.calculateTotalValue();

		inventory.sortByName();
		System.out.println("After sorting by name:");
		inventory.displayInventory();

		inventory.sortByPrice();
		System.out.println("After sorting by price:");
		inventory.displayInventory();
	}
}
