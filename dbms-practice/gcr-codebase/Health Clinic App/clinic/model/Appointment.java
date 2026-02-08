package clinic.model;

public class Appointment {

    private int patientId;
    private int doctorId;
    private String date;
    private String time;
    private String reason;

    public Appointment(int patientId, int doctorId,
                       String date, String time, String reason) {

        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }
}
