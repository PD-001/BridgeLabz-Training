package clinic.model;

public class Doctor {

    private String name;
    private String specialization;
    private String phone;
    private String email;

    public Doctor(String name, String specialization,
                  String phone, String email) {

        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
