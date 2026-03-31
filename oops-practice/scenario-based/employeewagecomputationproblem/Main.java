package employeewagecomputationproblem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String employeeName;
		int employeeType;
		
		System.out.println("Welcome to Employee Wage Computation Program. \nPlease enter your name:");
		employeeName=sc.nextLine();
		
		//object for employeewagecomputation class
		EmployeeWageComputation newEmployee= new EmployeeWageComputation(employeeName);
		
		
		//take input until specified input is provided
		while(true) {
			System.out.println("Please enter type of employee: (0 for full-time employee or 1 for part-time employee)");
			employeeType=sc.nextInt();
			if(employeeType==0 || employeeType==1) {
				newEmployee.setEmployeeType(employeeType);
				break;
			}
		}
		System.out.println();
		
		System.out.println("Today's presence:");
		newEmployee.presence();
		
		System.out.println();
		
		System.out.println("Daily Wage:");
		System.out.println("The daily wage of employee "+ employeeName + " is "+ newEmployee.dailyWageCalculator());
		
		System.out.println();
		
		System.out.println("Monthly Wage:");
		newEmployee.monthlyWageCalculator();

		System.out.println();
		
		System.out.println("Wage when 100 hours or 20 days is reached:");
		newEmployee.calculateWageWithConstraints();
		sc.close();
	}
}
