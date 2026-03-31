package employeewagecomputation;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWageBuilder implements EmployeeWageBuilderInterface {

    private ArrayList<CompanyEmployeeWage> companyList;

    public EmployeeWageBuilder() {
        companyList= new ArrayList<>();
    }

    @Override
    public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

        if (!isValidCompanyName(companyName)) {
            throw new IllegalArgumentException("Invalid Company Name");
        }

        CompanyEmployeeWage company= new CompanyEmployeeWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);

        companyList.add(company);
    }


    @Override
    public void computeWage() {

        for (CompanyEmployeeWage company:companyList) {

            int totalHoursWorked= 0;
            int totalDaysWorked= 0;
            int totalWage= 0;

            Random random= new Random();

            while (totalHoursWorked<company.maxWorkingHours && totalDaysWorked<company.maxWorkingDays) {

                totalDaysWorked++;

                int empType= random.nextInt(3);
                int hoursWorked= 0;

                switch (empType) {
                    case 1:
                        hoursWorked= 8;
                        break;
                    case 2:
                        hoursWorked= 4;
                        break;
                    default:
                        hoursWorked= 0;
                }

                totalHoursWorked+=hoursWorked;
                int dailyWage= hoursWorked*company.wagePerHour;
                totalWage+=dailyWage;

                company.dailyWages.add(dailyWage);
            }

            company.setTotalEmpWage(totalWage);
            System.out.println(company);
        }
    }

    private boolean isValidCompanyName(String companyName) {

        return companyName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmployeeWage company:companyList) {

            if (company.companyName.equals(companyName)) {
                return company.totalEmpWage;
            }
        }

        return -1;
    }
}
