package librarymanagementsystem;

public class Main {
 public static void main(String[] args) {
     LibraryItem[] items= {
         new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
         new Magazine("M101", "National Geographic", "Various"),
         new DVD("D202", "Inception", "Christopher Nolan")
     };

     for (LibraryItem item:items) {
         item.getItemDetails();
         System.out.println("Loan Duration: "+ item.getLoanDuration() +" days");

         if (item instanceof Reservable) {
             Reservable reservable= (Reservable) item;
             if (reservable.reserveItem("John Doe")) {
                 System.out.println("Item reserved successfully by John Doe.");
             } else {
                 System.out.println("Item is already reserved.");
             }
             System.out.println("Availability: "+ (reservable.checkAvailability()?"Available":"Not Available"));
         } else {
             System.out.println("Reservation not supported for this item.");
         }

         System.out.println("");
     }
 }
}