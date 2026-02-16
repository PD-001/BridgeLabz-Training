package employeewagecomputation;

public class Main {

    public static void main(String[] args) {

        EmployeeWageBuilderInterface empWageBuilder= new EmployeeWageBuilder();

        System.out.println("Welcome to Employee Wage Computation Program");
        
        empWageBuilder.addCompany("TCS", 20, 20, 100);
        empWageBuilder.addCompany("Capgemini", 25, 22, 120);
        empWageBuilder.addCompany("Wipro", 18, 25, 90);

        empWageBuilder.computeWage();

        System.out.println("Total Wage for Capgemini: "+ empWageBuilder.getTotalWage("Capgemini"));
    }
}
