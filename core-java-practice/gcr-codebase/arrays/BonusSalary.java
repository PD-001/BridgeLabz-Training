import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] yearsOfService= new double[10];
        double[] salaries= new double[10];
        double[] newSalaries= new double[10];
        double[] bonuses= new double[10];
        
        //input salaries and years of service
        for(int i=0;i<10;i++){
            System.out.println("For employee "+ (i+1) +"\n");
            System.out.println("Enter salary");
            double salary= sc.nextDouble();
            System.out.println("Enter years of service");
            double years= sc.nextDouble();

            if(salary<=0 || years<0){
                System.out.println("Invalid input. Please enter again.");
                i--; //decrement index to repeat input for this employee
                continue;
            }

            salaries[i]= salary;
            yearsOfService[i]= years;
        }

        double totalBonus=0;
        double totalOld=0;
        double totalNew=0;

        //calculate bonuses and new salaries
        for(int i=0;i<10;i++){
            double bonusRate= (yearsOfService[i]>5)?0.05:0.02;
            bonuses[i]= salaries[i]*bonusRate;
            newSalaries[i]= salaries[i]+bonuses[i];

            totalBonus+=bonuses[i];
            totalOld+=salaries[i];
            totalNew+=newSalaries[i];
        }

        //print totals
        System.out.println("Total Bonus Payout: "+ totalBonus);
        System.out.println("Total Old Salary: "+ totalOld);
        System.out.println("Total New Salary: "+ totalNew);

        sc.close();
    }    
}
