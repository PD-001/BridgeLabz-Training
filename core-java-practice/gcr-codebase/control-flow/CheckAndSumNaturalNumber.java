import java.util.Scanner;

public class CheckAndSumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        if(number>0){//check if number is positive
            int sum= 0;
            for(int i=1;i<=number;i++){//loop from 1 to number
                sum+=i;//add i to sum
            }
            System.out.println("The sum of "+ number +" natural numbers is "+ sum);
        }
        else{
            System.out.println("The number "+ number +" is not a natural number");
        }
        sc.close();
    }
}
