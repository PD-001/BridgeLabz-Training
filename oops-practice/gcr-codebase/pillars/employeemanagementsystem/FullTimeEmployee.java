package employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); //fixed salary
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department= departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Full-Time Department: "+ department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}