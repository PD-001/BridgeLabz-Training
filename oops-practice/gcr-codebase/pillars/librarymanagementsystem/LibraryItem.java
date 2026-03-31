package librarymanagementsystem;

abstract class LibraryItem {
 private String itemId;
 private String title;
 private String author;
 private String borrower;  //sensitive Data (Encapsulation)
 private boolean isBorrowed;

 public LibraryItem(String itemId, String title, String author) {
     this.itemId= itemId;
     this.title= title;
     this.author= author;
     this.isBorrowed= false;
 }

 //encapsulation: Getters
 public String getItemId() {
    return itemId;
 }

 public String getTitle() {
    return title;
 }

 public String getAuthor() {
    return author;
 }

 protected String getBorrower() {
    return borrower;
 }

 protected void setBorrower(String borrower) {
    this.borrower= borrower;
 }

 protected boolean isBorrowed() {
    return isBorrowed;
 }

 protected void setBorrowed(boolean borrowed) {
    this.isBorrowed= borrowed;
 }

 //concrete Method
 public void getItemDetails() {
    System.out.println("Item ID: "+ itemId);
    System.out.println("Title: "+ title);
    System.out.println("Author: "+ author);
 }

 //abstract Method
 public abstract int getLoanDuration();
}
