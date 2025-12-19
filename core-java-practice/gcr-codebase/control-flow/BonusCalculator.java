import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ServiceYears= sc.nextInt();
        int salary= sc.nextInt();
        
        if(ServiceYears>5){//if year of service is more than 5
            double bonus= 0.05*(double)salary;//calculate bonus as 5% of salary
            System.out.println(bonus);
        }else{
            System.out.println("No bonus");
        }
        sc.close();
    }
}
