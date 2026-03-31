package librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
 public Book(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 @Override
 public int getLoanDuration() {
     return 21;  //21 days loan period
 }

 @Override
 public boolean reserveItem(String borrowerName) {
     if (!isBorrowed()) {
         setBorrower(borrowerName);
         setBorrowed(true);
         return true;
     }
     return false;
 }

 @Override
 public boolean checkAvailability() {
     return !isBorrowed();
 }
}