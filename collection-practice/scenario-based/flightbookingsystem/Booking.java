package flightbookingsystem;

public class Booking {
    private Flight flight;
    private String passengerName;

    public Booking(Flight flight, String passengerName) {
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBooking() {
        System.out.println(
            "Passenger: " + passengerName +
            ", Flight: " + flight.getFlightId() +
            " (" + flight.getSource() + " -> " + flight.getDestination() + ")"
        );
    }
}
