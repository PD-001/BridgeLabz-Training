package librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
 public DVD(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 @Override
 public int getLoanDuration() {
     return 14;  //14 days loan period
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