package generics.dynamiconlinemarketplace;

public class Clothing extends Product<ClothingCategory> {

    public Clothing(String name, double price) {
        super(name, price, new ClothingCategory());
    }
}
