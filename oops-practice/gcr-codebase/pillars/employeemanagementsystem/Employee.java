package employeemanagementsystem;

public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    //constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId= employeeId;
        this.name= name;
        this.baseSalary= baseSalary;
    }

    //getters and Setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary>0) {
            this.baseSalary= baseSalary;
        } else {
            System.out.println("Base salary must be positive.");
        }
    }

    //abstract method
    public abstract double calculateSalary();

    //concrete method
    public void displayDetails() {
        System.out.println("Employee ID: "+ employeeId);
        System.out.println("Name: "+ name);
        System.out.println("Base Salary: $"+ baseSalary);
        System.out.println("Total Salary: $"+ calculateSalary());
    }
}
