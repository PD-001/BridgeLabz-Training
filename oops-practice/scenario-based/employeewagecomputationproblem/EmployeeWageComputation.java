package employeewagecomputationproblem;

import java.util.Random;

public class EmployeeWageComputation {
	
	Random random= new Random();
	
	String employeeName;
	private int wagePerhour= 20;
	private int hoursWorkedInADay;
	private int workDaysInMonth= 20;
	private int totalDaysWorked= 0;
	private int totalHoursWorked= 0;
	
	//constructor
	public EmployeeWageComputation(String employeeName) {
		this.employeeName= employeeName;
	}
	
	//getters and setters
	public void setHoursWorkedInADay(int hours) {
		this.hoursWorkedInADay= hours;
	}
	
	public int getHoursWorkedInADay() {
		return this.hoursWorkedInADay;
	}
	
	public int getWagePerHour() {
		return this.wagePerhour;
	}
	
	public int getWorkDaysInMonth() {
		return this.workDaysInMonth;
	}
	
//	public void setDaysWorked(int daysWorked) {
//		this.daysWorked= daysWorked;
//	}
	
	public void increaseDaysWorked() {
		this.totalDaysWorked++;
	}
	
	public int getDaysWorked() {
		return this.totalDaysWorked;
	}
	
	public int getTotalHoursWorked() {
		return totalHoursWorked;
	}

	public void setTotalHoursWorked(int totalHoursWorked) {
		this.totalHoursWorked = totalHoursWorked;
	}
	
	
	//sets employee type 
	public void setEmployeeType(int type) {
		switch(type) {
		case 0:
			setHoursWorkedInADay(8);
			System.out.println("Employee:"+ this.employeeName +" set as Full Time Employee. The work hours set accordingly.");
			break;
		case 1:
			setHoursWorkedInADay(4);;
			System.out.println("Employee:"+ this.employeeName +" set as Part Time Employee. The work hours set accordingly.");
			break;
		}
	}
	
	
	//checks for presence with help of Random
	public boolean presence() {
		
		int presentOrNot= random.nextInt(2);
		if(presentOrNot==0) {
			System.out.println("Employee "+ this.employeeName +" was not present."); 
			return false;
		}
		else {
			System.out.println("Employee "+ this.employeeName +" was present.");
//			setDaysWorked(random.nextInt(20)+1);
			return true;
		}
		
	}
	
	//calculates daily wage
	public int dailyWageCalculator() {
		
		return getWagePerHour()*getHoursWorkedInADay();
		
	}
	
	
	//calculates what the monthly wage is assuming 20 working days(uc-5)
	public void monthlyWageCalculator() {
	
//		for(int i=0;i<20;i++) {
//			if(presence()) {
//				increaseDaysWorked();
//				setTotalHoursWorked(getTotalHoursWorked()+getHoursWorkedInADay());
//			}
//		}
//		if(getTotalHoursWorked()>=100 || getDaysWorked()==20) {
//			System.out.println("The total month end wage of employee "+ employeeName + " is "+ dailyWageCalculator()*getWorkDaysInMonth());
//		}
//		else {
//			System.out.println("Sorry! You do not qualify for full month payment. You will qualify in:"+ (getWorkDaysInMonth()-getDaysWorked()));
//		}
		System.out.println("The total month end wage of employee "+ employeeName + " is "+ dailyWageCalculator()*getWorkDaysInMonth());
	}
	
	
	//calculates wage until condition is reached of 100 hours worked or 20 days reached(uc-6)
	public void calculateWageWithConstraints() {
		int totalWage= 0;
		while(true) {
			if(presence()) {
				increaseDaysWorked();
				setTotalHoursWorked(getTotalHoursWorked()+getHoursWorkedInADay());
				totalWage+=dailyWageCalculator();
				if(getTotalHoursWorked()>=100 || getDaysWorked()==20) {
					System.out.println("The total month end wage of employee "+ employeeName + " is "+ totalWage);
					break;
				}
			}
		}
	}

	
}
