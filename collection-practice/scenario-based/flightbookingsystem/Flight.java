package flightbookingsystem;

public class Flight {
    private String flightId;
    private String source;
    private String destination;
    private double price;

    public Flight(String flightId, String source, String destination, double price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void displayFlight() {
        System.out.println(
            flightId + " | " + source + " -> " + destination + " | ₹" + price
        );
    }
}
