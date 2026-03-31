package employeewagecomputation;

import java.util.ArrayList;

public class CompanyEmployeeWage {

    public final String companyName;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;

    public int totalEmpWage;
    public ArrayList<Integer> dailyWages;

    public CompanyEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

        this.companyName= companyName;
        this.wagePerHour= wagePerHour;
        this.maxWorkingDays= maxWorkingDays;
        this.maxWorkingHours= maxWorkingHours;
        this.dailyWages= new ArrayList<>();
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage= totalEmpWage;
    }

    @Override
    public String toString() {

        return "Company Name: " + companyName +
                ", Total Wage: " + totalEmpWage;
    }
}
