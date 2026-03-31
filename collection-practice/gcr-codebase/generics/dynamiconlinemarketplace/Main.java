package generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(new Book("Java Generics", 800));
        catalog.add(new Clothing("Jacket", 2500));

        for (Product<?> p : catalog) {
            DiscountService.applyDiscount(p, 10);
            System.out.println(p.getName() + " → " + p.getPrice());
        }
    }
}
