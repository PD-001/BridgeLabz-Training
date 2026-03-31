package generics.dynamiconlinemarketplace;

public class Book extends Product<BookCategory> {

    public Book(String name, double price) {
        super(name, price, new BookCategory());
    }
}
