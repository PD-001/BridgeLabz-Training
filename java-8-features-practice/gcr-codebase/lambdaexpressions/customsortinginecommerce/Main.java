package lambdaexpressions.customsortinginecommerce;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 30000, 4.5, 10));
        products.add(new Product("Phone", 15000, 4.7, 15));
        products.add(new Product("PC", 60000, 4.4, 5));
        
        System.out.println("Sorted using price:");
        products.sort((p1,p2)->Double.compare(p1.price,p2.price));
        System.out.println(products.toString());
        System.out.println();
        
        System.out.println("Sorted using rating:");
        products.sort((p1,p2)->Double.compare(p1.rating,p2.rating));
        System.out.println(products.toString());
        System.out.println();
        
        System.out.println("Sorted using discount:");
        products.sort((p1,p2)->Double.compare(p1.discount,p2.discount));
        System.out.println(products.toString());
        System.out.println();
    }
}