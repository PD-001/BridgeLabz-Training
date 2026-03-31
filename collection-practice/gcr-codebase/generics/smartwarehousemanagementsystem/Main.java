package generics.smartwarehousemanagementsystem;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceryStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop", 75000));
        electronicsStorage.addItem(new Electronics("Mobile", 45000));

        groceryStorage.addItem(new Groceries("Milk", 50));
        groceryStorage.addItem(new Groceries("Bread", 50));

        furnitureStorage.addItem(new Furniture("Table", 12000));
        furnitureStorage.addItem(new Furniture("Chair", 5000));

        System.out.println("Electronics");
        Storage.displayAllItems(electronicsStorage.getItems());

        System.out.println("\nGroceries");
        Storage.displayAllItems(groceryStorage.getItems());

        System.out.println("\nFurniture");
        Storage.displayAllItems(furnitureStorage.getItems());
    }
}
