package flightbookingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlightService service = new FlightService();

        System.out.print("Enter source: ");
        String source = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        service.searchFlights(source, destination);

        System.out.print("\nEnter Flight ID to book: ");
        String flightId = sc.nextLine();

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        service.bookFlight(flightId, name);

        service.displayBookings();
        sc.close();
    }
}
