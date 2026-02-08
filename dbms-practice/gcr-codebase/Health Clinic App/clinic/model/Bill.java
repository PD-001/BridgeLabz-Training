package clinic.model;

public class Bill {

    private int visitId;
    private double amount;
    private String paymentStatus;

    public Bill(int visitId, double amount, String paymentStatus) {
        this.visitId = visitId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public int getVisitId() {
        return visitId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}
