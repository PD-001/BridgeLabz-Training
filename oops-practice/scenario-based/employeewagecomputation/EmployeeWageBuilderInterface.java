package employeewagecomputation;

public interface EmployeeWageBuilderInterface {

    void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);

    void computeWage();

    int getTotalWage(String companyName);
}
