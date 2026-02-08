package clinic.model;

public class Patient {

    private int id;
    private String name;
    private String dob;
    private String phone;
    private String email;
    private String address;
    private String bloodGroup;

    // Constructor for reading from DB
    public Patient(int id, String name, String dob, String phone,
                   String email, String address, String bloodGroup) {

        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    // Constructor for inserting
    public Patient(String name, String dob, String phone,
                   String email, String address, String bloodGroup) {

        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}
