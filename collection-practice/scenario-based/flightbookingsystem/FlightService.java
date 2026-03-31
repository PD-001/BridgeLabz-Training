package flightbookingsystem;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    // Array for available flights
    private Flight[] flights = {
        new Flight("AI101", "Delhi", "Mumbai", 5500),
        new Flight("AI102", "Mumbai", "Bangalore", 4800),
        new Flight("AI103", "Delhi", "Chennai", 6200),
        new Flight("AI104", "Pune", "Delhi", 5100)
    };

    // List for bookings
    private List<Booking> bookings = new ArrayList<>();

    // Search flights (case-insensitive)
    public void searchFlights(String source, String destination) {
        boolean found = false;

        for (Flight f : flights) {
            if (f.getSource().equalsIgnoreCase(source)
                    && f.getDestination().equalsIgnoreCase(destination)) {
                f.displayFlight();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found.");
        }
    }

    // Book flight
    public void bookFlight(String flightId, String passengerName) {
        for (Flight f : flights) {
            if (f.getFlightId().equalsIgnoreCase(flightId)) {
                bookings.add(new Booking(f, passengerName));
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Invalid Flight ID.");
    }

    // Display bookings
    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        System.out.println("\n--- Booking Details ---");
        for (Booking b : bookings) {
            b.displayBooking();
        }
    }
}
